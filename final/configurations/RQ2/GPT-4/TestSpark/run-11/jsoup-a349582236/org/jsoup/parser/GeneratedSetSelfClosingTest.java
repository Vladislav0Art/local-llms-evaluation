package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetSelfClosingTest {

    @Test
    public void setSelfClosingTest() {
        Tag tag = Tag.valueOf("div");
        tag = tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

}