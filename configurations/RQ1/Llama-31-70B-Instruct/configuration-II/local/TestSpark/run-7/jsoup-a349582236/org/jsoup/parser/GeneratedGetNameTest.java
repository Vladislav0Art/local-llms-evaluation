package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

}