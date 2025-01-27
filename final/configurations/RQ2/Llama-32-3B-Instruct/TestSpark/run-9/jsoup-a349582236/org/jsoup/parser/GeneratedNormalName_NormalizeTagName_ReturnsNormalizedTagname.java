package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_NormalizeTagName_ReturnsNormalizedTagname {

    @Test
    public void normalName_NormalizeTagName_ReturnsNormalizedTagname() {
        String tagName = "span";
        Tag tag = Tag.valueOf(tagName);
        assertEquals("span", tag.normalName());
    }

}