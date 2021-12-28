package twitter_app.postPojo;


public class postOutputObj {

    private nestedPostObj data;

    public postOutputObj() {

    }

    postOutputObj(nestedPostObj data) {
        this.data = data;
    }

    public nestedPostObj getData() {
        return data;
    }


}
