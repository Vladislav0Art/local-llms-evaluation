package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
    }

}