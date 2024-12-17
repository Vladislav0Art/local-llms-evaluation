package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTestGetValueOrDefault {

    @Test
    public void testGetValueOrDefault() {
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf("p");
        assertEquals("P", tag.getValueOrDefault(settings));
        tag = Tag.valueOf("DIV");
        assertEquals("DIV", tag.getValueOrDefault(settings));
    }

}