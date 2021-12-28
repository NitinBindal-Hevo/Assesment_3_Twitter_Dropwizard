package twitter_app;


public class postObj {

    private nestedPostObj data;

    postObj() {

    }

    postObj(nestedPostObj data) {
        this.data = data;
    }

    public nestedPostObj getData() {
        return data;
    }


}
