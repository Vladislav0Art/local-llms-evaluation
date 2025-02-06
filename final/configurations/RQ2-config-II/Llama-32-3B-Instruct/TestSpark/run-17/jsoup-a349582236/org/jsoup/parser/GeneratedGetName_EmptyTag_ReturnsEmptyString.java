package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetName_EmptyTag_ReturnsEmptyString {

    @Test
    public void getName_EmptyTag_ReturnsEmptyString() {
        Tag tag = new Tag();
        assertEquals("", tag.getName());
    }

}