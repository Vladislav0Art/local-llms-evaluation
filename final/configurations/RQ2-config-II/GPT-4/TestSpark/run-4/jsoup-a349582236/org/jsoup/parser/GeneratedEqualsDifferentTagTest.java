package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentTagTest {

    @Test
    public void equalsDifferentTagTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("span");
        assertFalse(tag1.equals(tag2));
    }

}