package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfExistingTagTest {

    @Test
    public void valueOfExistingTagTest() {
        Tag tag = Tag.valueOf("div");
        assertNotNull(tag);
    }

}