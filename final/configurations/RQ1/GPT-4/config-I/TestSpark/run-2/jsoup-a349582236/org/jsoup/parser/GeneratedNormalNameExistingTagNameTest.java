package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalNameExistingTagNameTest {

    @Test
    public void normalNameExistingTagNameTest() {
        Tag tag = Tag.valueOf("body");
        assertEquals("body", tag.normalName());
    }

}