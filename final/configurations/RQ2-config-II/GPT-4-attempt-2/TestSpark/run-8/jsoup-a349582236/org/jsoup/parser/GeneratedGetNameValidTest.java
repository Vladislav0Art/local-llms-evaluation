package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedGetNameValidTest {

    @Test
    public void getNameValidTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
    }

}