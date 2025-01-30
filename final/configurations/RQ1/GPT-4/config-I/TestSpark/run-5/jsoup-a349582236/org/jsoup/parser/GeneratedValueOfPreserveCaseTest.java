package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedValueOfPreserveCaseTest {

    @Test
    public void valueOfPreserveCaseTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.preserveCase);
        String tagName = tag.getName();
        assertEquals("div", tagName);
    }

}