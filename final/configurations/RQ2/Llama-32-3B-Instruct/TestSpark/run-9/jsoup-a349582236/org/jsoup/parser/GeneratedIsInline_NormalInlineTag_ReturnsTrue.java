package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_NormalInlineTag_ReturnsTrue {

    @Test
    public void isInline_NormalInlineTag_ReturnsTrue() {
        Tag tag = Tag.valueOf("span");
        assertTrue(tag.isInline());
    }

}