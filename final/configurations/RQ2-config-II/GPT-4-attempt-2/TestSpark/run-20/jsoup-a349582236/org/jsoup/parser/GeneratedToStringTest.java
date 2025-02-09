package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("<p>", tag.toString());
    }

}