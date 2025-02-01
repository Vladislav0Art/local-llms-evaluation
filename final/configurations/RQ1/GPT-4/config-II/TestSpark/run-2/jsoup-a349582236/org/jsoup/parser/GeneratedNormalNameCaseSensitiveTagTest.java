package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalNameCaseSensitiveTagTest {

    @Test
    public void normalNameCaseSensitiveTagTest() {
        Tag tag = Tag.valueOf("P", ParseSettings.preserveCase);
        assertEquals("p", tag.normalName());
    }

}