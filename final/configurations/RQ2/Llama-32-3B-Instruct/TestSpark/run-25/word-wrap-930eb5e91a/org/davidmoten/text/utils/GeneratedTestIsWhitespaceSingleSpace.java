package org.davidmoten.text.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GeneratedTestIsWhitespaceSingleSpace {

    @Test
    public void testIsWhitespaceSingleSpace() {
        WordWrap wordWrap = new WordWrap();
        assertTrue(wordWrap.isWhitespace(" "));
    }

}