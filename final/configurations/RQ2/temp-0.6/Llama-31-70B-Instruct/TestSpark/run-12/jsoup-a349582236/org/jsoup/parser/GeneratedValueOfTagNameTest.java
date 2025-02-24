package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedValueOfTagNameTest {

    @Test
    public void valueOfTagNameTest() {
        String tagName = "tagName";
        Tag expectedTag = new Tag();
        assertEquals(expectedTag, Tag.valueOf(tagName));
    }

}