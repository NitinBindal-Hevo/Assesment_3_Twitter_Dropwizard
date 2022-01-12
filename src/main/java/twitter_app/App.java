package twitter_app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

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
 GetInputObject obj = new GetInputObject(id);
 TwrClient client = new TwrClient("GET",obj,config);
 GetOutputObj res = (GetOutputObj) client.execute();
 System.out.println(res);
 */

/**
 * POST Request
 //        Test_1 : Setting up my Twitter ! . Nitin_28DEC

 Scanner inp = new Scanner(System.in);
 System.out.println("Enter Tweet's body :  ");
 String body = inp.nextLine();
 PostInputObject obj = new PostInputObject(body);

 TwrClient client = new TwrClient("POST",obj,config);
 PostOutputObj res = (PostOutputObj) client.execute();

 System.out.println("Id :  " + res.getData().getId() + "\n" + "Text :  " + res.getData().getText());

 */

    }


}
