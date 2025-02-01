package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        Tag t1 = Tag.valueOf("div");
        Tag t2 = Tag.valueOf("Div", ParseSettings.preserveCase);
        assertEquals("div", t1.getName());
        assertEquals("Div", t2.getName());
    }

}