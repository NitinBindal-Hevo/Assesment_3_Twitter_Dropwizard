package twitter_app;

public class postInputObject {


    String text;

    postInputObject(String body)
    {
        this.text = body;
    }

    public String getText() {
        return text;
    }
}
