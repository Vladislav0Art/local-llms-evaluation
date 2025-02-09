package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSelfClosingImageTagTest {

    @Test
    public void isSelfClosingImageTagTest() {
        Tag imgTag = Tag.valueOf("img").setSelfClosing();
        assertTrue(imgTag.isSelfClosing());
    }

}