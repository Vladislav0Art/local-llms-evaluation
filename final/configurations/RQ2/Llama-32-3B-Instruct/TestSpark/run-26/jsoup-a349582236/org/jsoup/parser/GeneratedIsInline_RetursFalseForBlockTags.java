package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_RetursFalseForBlockTags {

    @Test
    public void isInline_RetursFalseForBlockTags() {
        Tag tag1 = new Tag("div"); // inline tag
        Tag tag2 = new Tag("p");   // block tag
        assertFalse(tag1.isInline());
        assertTrue(tag2.isInline());
    }

}