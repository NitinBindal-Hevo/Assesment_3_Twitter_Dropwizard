package twitter_app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import twitter_app.getPojo.getInputObject;
import twitter_app.getPojo.getOutputObj;
import twitter_app.postPojo.postInputObject;
import twitter_app.postPojo.postOutputObj;

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        if (args.length < 1) {
            System.out.println("Enter configuration file !");
            System.exit(0);
        }

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        File file = new File(args[0]);
        TwitterConfiguration config = mapper.readValue(file, TwitterConfiguration.class);


/**
 * GET Request

 Scanner inp = new Scanner(System.in);
 System.out.println("Enter the Tweet Id :  ");
 String id = inp.nextLine();
 getInputObject obj = new getInputObject(id);
 twrClient client = new twrClient("GET",obj,config);
 getOutputObj res = (getOutputObj) client.execute();
 System.out.println(res);
 */

/**
 * POST Request
 //        Test_1 : Setting up my Twitter ! . Nitin_28DEC

 Scanner inp = new Scanner(System.in);
 System.out.println("Enter Tweet's body :  ");
 String body = inp.nextLine();
 postInputObject obj = new postInputObject(body);

 twrClient client = new twrClient("POST",obj,config);
 postOutputObj res = (postOutputObj) client.execute();

 System.out.println("Id :  " + res.getData().getId() + "\n" + "Text :  " + res.getData().getText());

 */

    }


}
