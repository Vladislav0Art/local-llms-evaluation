package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedGetName_NonEmptyName_ReturnsTagName {

    @Test
    public void getName_NonEmptyName_ReturnsTagName() {
        String tagName = "div";
        String expectedTagName = tagName;
        Tag tag = new Tag(tagName);
        assertEquals(expectedTagName, tag.getName());
    }

}