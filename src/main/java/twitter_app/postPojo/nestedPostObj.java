package twitter_app.postPojo;

public class nestedPostObj {

    private String id;
    private String text;

    public nestedPostObj() {

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
