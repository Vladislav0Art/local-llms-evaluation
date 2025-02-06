package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_EmptyTag_ReturnsEmptyTag {

    @Test
    public void valueOf_EmptyTag_ReturnsEmptyTag() {
        String tagName = "";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        assertNotNull(tag);
        assertTrue(tag.getName().isEmpty());
    }

}