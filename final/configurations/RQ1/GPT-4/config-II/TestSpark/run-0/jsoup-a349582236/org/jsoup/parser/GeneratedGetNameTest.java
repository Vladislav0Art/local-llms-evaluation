package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("p");
        assertEquals("p", tag.getName());
    }

}