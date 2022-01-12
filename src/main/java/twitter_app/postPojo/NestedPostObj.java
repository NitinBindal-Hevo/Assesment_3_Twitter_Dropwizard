package twitter_app.postPojo;

public class NestedPostObj {

    private String id;
    private String text;

    public NestedPostObj() {

    }

    public NestedPostObj(String id, String text) {
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
