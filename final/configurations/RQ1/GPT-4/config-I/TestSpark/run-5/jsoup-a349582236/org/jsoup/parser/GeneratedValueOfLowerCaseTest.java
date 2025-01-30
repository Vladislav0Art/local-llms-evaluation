package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedValueOfLowerCaseTest {

    @Test
    public void valueOfLowerCaseTest() {
        Tag tag = Tag.valueOf("div");
        String tagName = tag.getName();
        assertEquals("div", tagName);
    }

}