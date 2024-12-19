package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedIsInline_InlineTag_ReturnsTrue {

    @Test
    public void isInline_InlineTag_ReturnsTrue() {
        String tagName = "span";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertTrue(tag.isInline());
    }

}