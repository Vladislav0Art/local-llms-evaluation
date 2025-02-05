package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("AnOtHerTesT");

        assertEquals("anothertest", tag.normalName());
    }

}