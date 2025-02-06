package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedValueOf_ValidTagName_ReturnsTagInstance {

    @Test
    public void valueOf_ValidTagName_ReturnsTagInstance() {
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName);
        assertNotNull(tag);
        assertEquals(tagName, tag.getName());
    }

}