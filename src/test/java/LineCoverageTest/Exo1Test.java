package LineCoverageTest;

import org.example.Exo1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exo1Test {
    Exo1Test() {
    }

    @Test
    void PalindromeTestNullStrings() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Exo1.isPalindrome((String)null);
        });
    }

    @Test
    void PalindromeTestwithPalindromeString() {
        Assertions.assertTrue(Exo1.isPalindrome("radar"));
    }

    @Test
    void PalindromeTestwithNoPalindromeString() {
        Assertions.assertFalse(Exo1.isPalindrome("rada"));
    }
}