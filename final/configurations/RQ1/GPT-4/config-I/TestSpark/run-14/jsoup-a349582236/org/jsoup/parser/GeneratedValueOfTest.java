package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());

        Tag tagWithSettings = Tag.valueOf("DIV", ParseSettings.preserveCase);
        assertEquals("DIV", tagWithSettings.getName());
    }

}