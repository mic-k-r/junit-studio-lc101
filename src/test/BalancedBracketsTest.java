package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test(expected = IllegalArgumentException.class)
    public void nullThrowsIllegalArgumentException() {
        BalancedBrackets.hasBalancedBrackets(null);
        fail("This shouldn't happen because there should be an error");
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void unmatchedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void wordInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hello]"));
    }

    @Test
    public void phraseInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hello, world!]"));
    }

    @Test
    public void spaceInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ ]"));
    }

    @Test
    public void outOfOrderBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

}
