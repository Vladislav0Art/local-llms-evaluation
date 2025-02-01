package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Tag t = new Tag("Div");
        assertEquals("div", t.normalName());
    }

}