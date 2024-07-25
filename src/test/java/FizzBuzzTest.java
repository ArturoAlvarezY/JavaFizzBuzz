import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is; 
import org.junit.jupiter.api.Test;

import dev.arturo.models.FizzBuzz; 

public class FizzBuzzTest {

    @Test
    void testCheckNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
    assertThat(fizzBuzz.checkNumber(3), is("Fizz"));
    assertThat(fizzBuzz.checkNumber(5), is("Buzz"));
    assertThat(fizzBuzz.checkNumber(15), is("FizzBuzz"));
    assertThat(fizzBuzz.checkNumber(13), is("Fizz"));
    assertThat(fizzBuzz.checkNumber(52), is("Buzz"));
    assertThat(fizzBuzz.checkNumber(2), is("2"));
}
}