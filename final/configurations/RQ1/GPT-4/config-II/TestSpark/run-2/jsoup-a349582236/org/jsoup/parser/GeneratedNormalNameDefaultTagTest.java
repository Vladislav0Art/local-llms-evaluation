package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalNameDefaultTagTest {

    @Test
    public void normalNameDefaultTagTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.normalName());
    }

}