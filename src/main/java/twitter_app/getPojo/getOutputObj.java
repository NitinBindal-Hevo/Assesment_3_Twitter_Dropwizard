package twitter_app.getPojo;


import com.fasterxml.jackson.annotation.JsonProperty;

public class getOutputObj {

    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("id")
    private String id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("source")
    private String source;

    public getOutputObj() {

    }

    public getOutputObj(String created_at, String id, String id_str, String text, String source) {
        this.created_at = created_at;
        this.id = id;
        this.text = text;
        this.source = source;
    }


    public String getCreated_at() {
        return created_at;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }


    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "created_at :  " + this.created_at + "\n" + "id :  " + this.id + "\n" + "text :  " + this.text
                + "\n" + "source: " + this.source + "\n";
    }

}

