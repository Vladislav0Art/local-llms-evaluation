package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("Input", ParseSettings.preserveCase);
        String normalName = tag.normalName();
        assertEquals("input", normalName);
    }

}