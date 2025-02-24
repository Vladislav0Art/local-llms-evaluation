package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfTagNameTest {

    @Test
    public void valueOfTagNameTest() {
        Tag tag = Tag.valueOf("test");
        assertEquals("test", tag.getName());
    }

}