package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedEquals_NullTag_ReturnsFalse {

    @Test
    public void equals_NullTag_ReturnsFalse() {
        Tag tag1 = new Tag("img");
        Tag tag2 = null;
        assertFalse(tag1.equals(tag2));
    }

}