import java.util.Random;
import java.util.logging.Logger;

public class NumberAutoGeneration{
    private static Logger logger = Logger.getLogger("NumberAutoGeneration");

    public String genNumbers(int num) {
        if(num > 10){
            return "-1";
        }
        String returnString = "";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < num; i++){
            while(true){
                int a = random.nextInt(9);
                if(sb.indexOf(String.valueOf(a)) == -1){
                    sb.append(a);
                    break;
                }
            }
        }
        returnString = sb.toString();
        //logger.info("the system num is " + returnString);
        return returnString;
    }


}
