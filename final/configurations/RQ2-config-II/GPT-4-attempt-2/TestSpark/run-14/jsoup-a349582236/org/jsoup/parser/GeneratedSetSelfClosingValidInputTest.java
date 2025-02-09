package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedSetSelfClosingValidInputTest {

    @Test
    public void setSelfClosingValidInputTest() {
        Tag tag = Tag.valueOf("tag_name").setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

}