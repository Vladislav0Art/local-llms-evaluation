package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("input");
        String tagName = tag.getName();
        assertEquals("input", tagName);
    }

}