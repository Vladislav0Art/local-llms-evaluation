package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestWrapException {

    private Set<Character> extraWordChars;

    public void setExtraWordChars(Set<Character> extraWordChars) {
        this.extraWordChars = extraWordChars;
    }

    public String wrap(String text, int width) {
        // implement the word wrapping logic here
        return "";
    }
}

public class GeneratedTest extends TestCase {

    @Test
    public void testWrapException() {
        WordWraper wordWraper = new WordWraper();
        wordWraper.setExtraWordChars(Set.of(' '));

        try {
            wordWraper.wrap("", 20);
            fail("Expected exception");
        } catch (Exception e) {
        }
    }

}