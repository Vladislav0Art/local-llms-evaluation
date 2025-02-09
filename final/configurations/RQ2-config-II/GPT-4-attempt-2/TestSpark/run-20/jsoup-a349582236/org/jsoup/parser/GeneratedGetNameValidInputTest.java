package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedGetNameValidInputTest {

    @Test
    public void getNameValidInputTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
    }

}