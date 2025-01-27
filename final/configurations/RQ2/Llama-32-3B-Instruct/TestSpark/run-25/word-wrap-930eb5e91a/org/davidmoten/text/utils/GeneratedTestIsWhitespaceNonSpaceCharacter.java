package org.davidmoten.text.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GeneratedTestIsWhitespaceNonSpaceCharacter {

    @Test
    public void testIsWhitespaceNonSpaceCharacter() {
        WordWrap wordWrap = new WordWrap();
        assertFalse(wordWrap.isWhitespace("a"));
    }
}

class WordWrap {

    public String rightTrim(String text) {
        return text.trimEnd();
    }

    public String leftTrim(String text) {
        return text.trimStart();
    }

    public boolean isWhitespace(String text) {
        return text.matches("^\\s*$");
    }

}