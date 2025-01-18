package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagTrueTest {

    @Test
    public void isKnownTagTrueTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isKnownTag());
    }

}