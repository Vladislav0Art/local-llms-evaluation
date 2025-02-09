package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsEmpty_EmptyTags_ReturnsTrue {

    @Test
    public void isEmpty_EmptyTags_ReturnsTrue() {
        Tag tag = new Tag("");
        assertTrue(tag.isEmpty());
    }

}