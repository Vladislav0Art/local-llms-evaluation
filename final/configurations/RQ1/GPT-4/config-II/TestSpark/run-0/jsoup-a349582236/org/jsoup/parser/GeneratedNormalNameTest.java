package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("P");
        assertEquals("p", tag.normalName());
    }

}