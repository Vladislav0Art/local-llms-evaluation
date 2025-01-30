package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfWhenTagNameIsGivenTest {

    @Test
    public void valueOfWhenTagNameIsGivenTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
    }

}