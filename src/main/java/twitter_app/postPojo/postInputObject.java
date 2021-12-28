package twitter_app.postPojo;

public class postInputObject {


    private String text;

    public postInputObject(String body) {
        this.text = body;
    }

    public String getText() {
        return text;
    }
}
