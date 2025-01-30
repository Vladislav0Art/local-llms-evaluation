package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsKnownTagInObjectTest {

    @Test
    public void isKnownTagInObjectTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isKnownTag());
    }

}