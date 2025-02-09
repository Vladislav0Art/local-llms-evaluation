package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedToStringValidTest {

    @Test
    public void toStringValidTest() {
        Tag tag = Tag.valueOf("p");
        assertNotNull(tag.toString());
    }

}