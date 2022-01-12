package twitter_app.requests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import twitter_app.TwitterConfiguration;
import twitter_app.postPojo.PostInputObject;
import twitter_app.postPojo.PostOutputObj;


public class Post {

    private String URL;
    private TwitterConfiguration configuration;
    private PostInputObject pojo;
    private ObjectMapper mapper;

    public Post(String URL, PostInputObject pojo, TwitterConfiguration configuration) {
        this.URL = URL;
        this.configuration = configuration;
        this.pojo = pojo;
        mapper = new ObjectMapper();
    }

    public PostOutputObj send() throws Exception {

        String body = mapper.writeValueAsString(pojo);

        Client client = Client.create();

        ClientResponse response = client.resource(this.URL)
                .header("Authorization", "OAuth oauth_consumer_key=\"" + configuration.getConsumer_Key() +
                        "\",oauth_token=\"" + configuration.getAccess_Token() + "\",oauth_signature_method=\"" + configuration.getAuth_Signature_Method() +
                        "\",oauth_timestamp=\"" + configuration.getTimestamp() + "\",oauth_nonce=\"" + configuration.getAuth_Nounce() +
                        "\",oauth_version=\"" + configuration.getAuth_Version() + "\",oauth_signature=\"" + configuration.getAuth_Signature() + "\"")
                .type("application/json")
                .post(ClientResponse.class, body);

        String json_str = response.getEntity(String.class);
        PostOutputObj res_obj = null;
        try {
            res_obj = mapper.readValue(json_str, PostOutputObj.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res_obj;
    }


}
