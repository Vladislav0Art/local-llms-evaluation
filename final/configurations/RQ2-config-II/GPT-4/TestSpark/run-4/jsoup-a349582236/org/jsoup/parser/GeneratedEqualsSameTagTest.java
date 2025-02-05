package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsSameTagTest {

    @Test
    public void equalsSameTagTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        assertTrue(tag1.equals(tag2));
    }

}