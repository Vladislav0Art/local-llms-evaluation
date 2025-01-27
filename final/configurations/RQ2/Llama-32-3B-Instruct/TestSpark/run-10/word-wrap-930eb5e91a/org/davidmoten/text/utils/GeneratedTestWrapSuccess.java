package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestWrapSuccess {

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
    public void testWrapSuccess() {
        WordWraper wordWraper = new WordWraper();
        wordWraper.setExtraWordChars(Set.of(' '));

        String wrappedText = wordWraper.wrap("This is a long text that needs to be wrapped.", 20);
        assertEquals(wrappedText, "This is a long text that needs to be wrapped.\n");
    }

}