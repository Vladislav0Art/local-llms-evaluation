package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedNormalName_DefaultTagTest {

    @Test
    public void normalName_DefaultTagTest() {
        Tag tag = Tag.valueOf("tagName");
        assertEquals("tagname", tag.normalName());
    }

}