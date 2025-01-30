package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("div");
        String stringRepresentation = tag.toString();
        assertEquals("div", stringRepresentation);
    }

}