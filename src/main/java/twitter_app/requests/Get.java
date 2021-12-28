package twitter_app.requests;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import twitter_app.TwitterConfiguration;
import twitter_app.getPojo.getInputObject;
import twitter_app.getPojo.getOutputObj;

public class Get {

    private String URL;
    private TwitterConfiguration configuration;

    public Get(String URL, getInputObject pojo, TwitterConfiguration configuration) {

        this.URL = URL + pojo.getId();
        this.configuration = configuration;
        Client client = Client.create();

    }

    public getOutputObj send() {
        Client client = Client.create();
        ClientResponse response = client.resource(this.URL)
                .header("Authorization", "Bearer " + configuration.getBearer_Token())
                .accept("application/json")
                .get(ClientResponse.class);

        String temp = response.getEntity(String.class);
        ObjectMapper obj = new ObjectMapper();
        obj.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        getOutputObj res_obj = null;

        try {
            res_obj = obj.readValue(temp, getOutputObj.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res_obj;

    }
}
