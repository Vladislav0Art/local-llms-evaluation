package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedInvalidTagNameTest {

    @Test
    public void invalidTagNameTest() {
        try {
            Tag.valueOf(null, ParseSettings.preserveCase);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

}