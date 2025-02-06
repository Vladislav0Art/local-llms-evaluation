package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedValueOf_ValidTagName_ReturnsTag {

    @Test
    public void valueOf_ValidTagName_ReturnsTag() {
        String validTagName = "<p>";
        Tag expectedTag = new Tag();
        // Assume implementation for equality check here
        assertEquals(expectedTag, Tag.valueOf(validTagName));
    }

}