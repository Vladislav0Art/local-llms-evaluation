package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedValueOf_NonEmptyTagname_ReturnsCorrectTag {

    @Test
    public void valueOf_NonEmptyTagname_ReturnsCorrectTag() {
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf("test", settings);
        assertNotNull(tag);
        assertEquals("test", tag.getName());
    }

}