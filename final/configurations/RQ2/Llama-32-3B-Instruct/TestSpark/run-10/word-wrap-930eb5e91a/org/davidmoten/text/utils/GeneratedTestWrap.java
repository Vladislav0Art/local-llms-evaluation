package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestWrap {

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
    public void testWrap() {
        WordWraper wordWraper = new WordWraper();
        wordWraper.setExtraWordChars(Set.of(' '));

        String wrappedText = wordWraper.wrap("This is a long text that needs to be wrapped.", 20);
        assertTrue(wrappedText.contains("This "));
    }

}