package twitter_app.postPojo;


public class PostOutputObj {

    private NestedPostObj data;

    public PostOutputObj() {

    }

    PostOutputObj(NestedPostObj data) {
        this.data = data;
    }

    public NestedPostObj getData() {
        return data;
    }


}
