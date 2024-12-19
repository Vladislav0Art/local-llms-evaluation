package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("DIV");
        assertEquals("div", tag.normalName());
    }

}