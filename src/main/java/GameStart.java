import java.util.logging.Logger;

public class GameStart {
    private static Logger logger = Logger.getLogger("GameStart");
    public String start(String inputStr){
        logger.info("the input number is " + inputStr);
        NumberAutoGeneration gen = new NumberAutoGeneration();
        String trueStr = gen.genNumbers(4);
        logger.info("the true number is " + trueStr);
        String charOfInput = "";
        String charOfTrue = "";
        int numOfA = 0;
        int numOfB = 0;
        for(int i = 0; i < 4; i++){
            charOfInput = inputStr.substring(i,i+1);
           // logger.info("-------" + charOfInput);
            charOfTrue = trueStr.substring(i,i+1);
            //logger.info("-------" + charOfTrue);
            if(charOfInput.equals(charOfTrue)){
                numOfA++;
               // logger.info("**********" + numOfA);
            }
            if(!charOfInput.equals(charOfTrue)){
                if(trueStr.indexOf(charOfInput) != -1){
                    numOfB++;
                   // logger.info("======" + numOfB);
                }
            }
        }
        String result = String.valueOf(numOfA) + "A" + numOfB + "B";
        logger.info("the final result is " + result);
        return result;
    }

}
