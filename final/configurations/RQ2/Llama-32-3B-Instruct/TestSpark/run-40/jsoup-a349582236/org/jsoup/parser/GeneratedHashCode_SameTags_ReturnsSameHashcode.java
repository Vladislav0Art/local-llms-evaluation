package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedHashCode_SameTags_ReturnsSameHashcode {

    @Test
    public void hashCode_SameTags_ReturnsSameHashcode() {
        String tagName = "img";
        Tag tag1 = new Tag(tagName);
        Tag tag2 = new Tag(tagName);
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

}