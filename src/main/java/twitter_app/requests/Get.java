package twitter_app.requests;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import twitter_app.TwitterConfiguration;
import twitter_app.getPojo.GetInputObject;
import twitter_app.getPojo.GetOutputObj;

public class Get {

    private String URL;
    private TwitterConfiguration configuration;

    public Get(String URL, GetInputObject pojo, TwitterConfiguration configuration) {

        this.URL = URL + pojo.getId();
        this.configuration = configuration;

    }

    public GetOutputObj send() {
        Client client = Client.create();
        ClientResponse response = client.resource(this.URL)
                .header("Authorization", "Bearer " + configuration.getBearer_Token())
                .accept("application/json")
                .get(ClientResponse.class);

        String temp = response.getEntity(String.class);
        ObjectMapper obj = new ObjectMapper();
        obj.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        GetOutputObj res_obj = null;

        try {
            res_obj = obj.readValue(temp, GetOutputObj.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res_obj;

    }
}
