package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_KnownTagName_ReturnsKnownTag {

    @Test
    public void valueOf_KnownTagName_ReturnsKnownTag() {
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        assertNotNull(tag);
        assertEquals("div", tag.getName());
    }

}