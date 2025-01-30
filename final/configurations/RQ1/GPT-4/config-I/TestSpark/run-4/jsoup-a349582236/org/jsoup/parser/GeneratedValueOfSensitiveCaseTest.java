package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedValueOfSensitiveCaseTest {

    @Test
    public void valueOfSensitiveCaseTest() {
        Tag tag = Tag.valueOf("P");
        assertEquals("P", tag.getName());
    }

}