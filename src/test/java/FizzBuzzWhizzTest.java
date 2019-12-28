import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzWhizzTest {

    @Test
    public void output() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        //assertThat("Invalid input".equals(fizzBuzzWhizz.output(0)));
        assertThat("Fizz".equals(fizzBuzzWhizz.output(3)));
        assertThat("Buzz".equals(fizzBuzzWhizz.output(5)));
        assertThat("Whizz".equals(fizzBuzzWhizz.output(7)));
        assertThat("FizzBuzz".equals(fizzBuzzWhizz.output(15)));
        assertThat("FizzWhizz".equals(fizzBuzzWhizz.output(21)));
        assertThat("BuzzWhizz".equals(fizzBuzzWhizz.output(35)));
        assertThat("FizzBuzzWhizz".equals(fizzBuzzWhizz.output(105)));
    }
}