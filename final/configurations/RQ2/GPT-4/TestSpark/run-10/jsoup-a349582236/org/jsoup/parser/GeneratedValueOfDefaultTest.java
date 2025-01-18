package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfDefaultTest {

    @Test
    public void valueOfDefaultTest() {
        Tag tag = Tag.valueOf("testTag");
        assertNotNull(tag);
        assertEquals("testTag", tag.getName());
    }

}