package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedNormalNameValidInputTest {

    @Test
    public void normalNameValidInputTest() {
        Tag tag = Tag.valueOf("TaG_NaMe");
        assertEquals("tag_name", tag.normalName());
    }

}