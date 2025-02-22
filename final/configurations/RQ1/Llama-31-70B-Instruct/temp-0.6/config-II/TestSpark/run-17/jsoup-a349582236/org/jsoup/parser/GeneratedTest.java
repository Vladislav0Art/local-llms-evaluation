package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testGetName() {
        String tagName = "p";
        Tag tag = new Tag(tagName);
        assertEquals(tagName, tag.getName());
    }

}