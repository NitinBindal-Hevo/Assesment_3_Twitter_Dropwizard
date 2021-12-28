package twitter_app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

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
 String id = inp.nextLine();
 getInputObject obj = new getInputObject(id);
 twrClient client = new twrClient("GET",obj,config);
 getObject res = (getObject) client.execute();
 System.out.println(res);
 **/

/**
 * POST Request
 //        Test_2: Setting up my Twitter ! . Nitin_28DEC

 Scanner inp = new Scanner(System.in);
 String body = inp.nextLine();
 postInputObject obj = new postInputObject(body);

 twrClient client = new twrClient("POST",obj,config);
 postObj res = (postObj)client.execute();

 System.out.println("Id :  " + res.getData().id + "\n" + "Text :  " + res.getData().getText());

 */

    }


}
