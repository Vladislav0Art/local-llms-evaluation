package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedGetNameInlineTagTest {

    @Test
    public void getNameInlineTagTest() {
        Tag t = Tag.valueOf("mark");
        assertEquals("mark", t.getName());
    }

}