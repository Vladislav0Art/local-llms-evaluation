package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals(tag.toString(), "<div>");
    }

}