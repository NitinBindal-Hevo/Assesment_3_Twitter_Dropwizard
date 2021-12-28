package twitter_app;


public class TwitterConfiguration {

    private String bearer_Token;
    private String consumer_Key;
    private String access_Token;
    private String auth_Signature_Method = "HMAC-SHA1";
    private String auth_Signature;
    private String auth_Nounce;
    private final String auth_Version = "1.0";
    private String timestamp;

    public TwitterConfiguration() {

    }

    public TwitterConfiguration(String bearer_Token) {
        System.out.println("Bearer_Token :  " + bearer_Token);
        this.bearer_Token = bearer_Token;
    }

    public String getBearer_Token() {
        return bearer_Token;
    }


    public String getConsumer_Key() {
        return consumer_Key;
    }


    public String getAccess_Token() {
        return access_Token;
    }


    public String getAuth_Signature_Method() {
        return auth_Signature_Method;
    }

    public String getAuth_Signature() {
        return auth_Signature;
    }


    public String getAuth_Nounce() {
        return auth_Nounce;
    }


    public String getAuth_Version() {
        return auth_Version;
    }


    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "******** Twitter Account Credentials ********\n"
                + "Bearer_Token :  " + this.bearer_Token + "\n"
                + "Consumer_Key :  " + this.consumer_Key + "\n"
                + "Access_Token :  " + this.access_Token + "\n"
                + "Auth_Signature_Method :  " + this.auth_Signature_Method + "\n"
                + "Auth_Signature :  " + this.auth_Signature + "\n"
                + "Auth_Nounce :  " + this.auth_Nounce + "\n"
                + "Auth_Version :  " + this.auth_Version + "\n"
                + "Timestamp :  " + this.timestamp + "\n";
    }

}
