package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSelfClosingSelfClosingTagTest {

    @Test
    public void isSelfClosingSelfClosingTagTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

}