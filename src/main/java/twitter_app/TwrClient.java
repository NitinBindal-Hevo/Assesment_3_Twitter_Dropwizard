package twitter_app;

import twitter_app.getPojo.GetInputObject;
import twitter_app.getPojo.GetOutputObj;
import twitter_app.postPojo.PostInputObject;
import twitter_app.postPojo.PostOutputObj;
import twitter_app.requests.Get;
import twitter_app.requests.Post;

public class TwrClient<T> {
    private String BASE_GET_URL = "https://api.twitter.com/1.1/statuses/show.json?id=";
    private String BASE_POST_URL = "https://api.twitter.com/2/tweets";

    private String REQ_TYPE;
    private TwitterConfiguration configuration;
    private T payload;

    public TwrClient(String REQ_TYPE, T payload, TwitterConfiguration configuration) {
        this.REQ_TYPE = REQ_TYPE;
        this.payload = payload;
        this.configuration = configuration;
    }


    private GetOutputObj getReqHandler() {
        Get getObj = new Get(this.BASE_GET_URL, (GetInputObject) this.payload, this.configuration);
        return getObj.send();
    }

    private PostOutputObj postReqHandler() throws Exception {

        Post postObj = new Post(this.BASE_POST_URL, (PostInputObject) this.payload, this.configuration);
        return postObj.send();

    }

    public Object execute() throws Exception {

        switch (this.REQ_TYPE) {
            case "GET":
                return getReqHandler();

            case "POST":
                return postReqHandler();
            default:
                System.out.println("Enter a valid Request type !");
                return null;
        }

    }

}
