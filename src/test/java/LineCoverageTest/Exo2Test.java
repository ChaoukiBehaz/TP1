package LineCoverageTest;

import org.example.Exo2;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;


public class Exo2Test {

    @Test
    public void isAnagramShouldReturnTrueIfTheInputIsAnagram() {

        Assertions.assertTrue(Exo2.isAnagram("chien", "niche"));
        //assertTrue(Anagram.isAnagram("listen", "silent"));
        // assertTrue(Anagram.isAnagram("rail safety", "fairy tales"));

    }
    @Test
    public void isAnagramshouldreturnFalseIfTheInputIsNotAnagram(){
        Assertions.assertFalse(Exo2.isAnagram("hello", "world"));

    }
    @Test
    public void isAnagramshouldreturnFalseIfTheInputsAreNotequaleInlenght() {
        Assertions.assertFalse(Exo2.isAnagram("hellom", "world"));

    }
    @Test

    public void IsPalindrommeShouldReturnExeptionIfTheInputsArenull()
    {
        Assertions.assertThrows(NullPointerException.class,() -> Exo2.isAnagram(null, null));

    }

}
