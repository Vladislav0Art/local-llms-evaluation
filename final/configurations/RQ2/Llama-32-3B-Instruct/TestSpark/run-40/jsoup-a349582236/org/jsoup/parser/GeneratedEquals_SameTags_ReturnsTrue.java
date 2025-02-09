package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedEquals_SameTags_ReturnsTrue {

    @Test
    public void equals_SameTags_ReturnsTrue() {
        String tagName = "img";
        Tag tag1 = new Tag(tagName);
        Tag tag2 = new Tag(tagName);
        assertTrue(tag1.equals(tag2));
    }

}