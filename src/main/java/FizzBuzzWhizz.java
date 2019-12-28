
public class FizzBuzzWhizz {
    public String output(int inputNum){
        String result = "";
        boolean threeDevide = false;
        boolean fiveDevide = false;
        boolean sevenDevide = false;
        if(inputNum <= 0){
            throw new IllegalArgumentException("Invalid input");
        }
        if(inputNum % 3 == 0){
            threeDevide = true;
        }
        if(inputNum % 5 == 0){
            fiveDevide = true;
        }
        if(inputNum % 7 == 0){
            sevenDevide = true;
        }
        if (threeDevide && fiveDevide && sevenDevide){
            return "FizzBuzzWhizz";
        }
        if (threeDevide && fiveDevide){
           return "FizzBuzz";
        }
        if (threeDevide && sevenDevide){
            return "FizzBuzz";
        }
        if (sevenDevide && fiveDevide){
            return "FizzWhizz";
        }
        if (threeDevide){
            return "Fizz";
        }
        if (fiveDevide){
            return "Buzz";
        }
        if (fiveDevide){
            return "Whizz";
        }
        return "error";
    }
}
