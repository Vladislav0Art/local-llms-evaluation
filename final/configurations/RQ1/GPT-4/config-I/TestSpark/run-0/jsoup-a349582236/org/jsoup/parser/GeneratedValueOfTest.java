package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("p");
        Tag anotherTag = Tag.valueOf("p", ParseSettings.preserveCase);
        assertEquals(tag, anotherTag);
    }

}