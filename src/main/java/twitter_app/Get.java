package twitter_app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class Get {

    private String URL;
    private TwitterConfiguration configuration;

    Get(String URL, getInputObject pojo, TwitterConfiguration configuration) {

        this.URL = URL + pojo.getId();
        this.configuration = configuration;
        Client client = Client.create();

    }

    public getObject send() {
        Client client = Client.create();
        ClientResponse response = client.resource(this.URL)
                .header("Authorization", "Bearer " + configuration.getBearer_Token())
                .accept("application/json")
                .get(ClientResponse.class);

        String temp = response.getEntity(String.class);
        ObjectMapper obj = new ObjectMapper();
        obj.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        getObject res_obj = null;

        try {
            res_obj = obj.readValue(temp, getObject.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res_obj;

    }
}
