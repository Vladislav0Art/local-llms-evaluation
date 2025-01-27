package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_RetursFalseForInlineTags {

    @Test
    public void isBlock_RetursFalseForInlineTags() {
        Tag tag1 = new Tag("div"); // inline tag
        Tag tag2 = new Tag("p");   // block tag
        assertTrue(tag1.isBlock());
        assertFalse(tag2.isBlock());
    }

}