package twitter_app.postPojo;

public class PostInputObject {


    private String text;

    public PostInputObject(String body) {
        this.text = body;
    }

    public String getText() {
        return text;
    }
}
