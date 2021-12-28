package twitter_app;

public class nestedPostObj {

    String id;
    String text;

    nestedPostObj() {

    }

    public nestedPostObj(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
