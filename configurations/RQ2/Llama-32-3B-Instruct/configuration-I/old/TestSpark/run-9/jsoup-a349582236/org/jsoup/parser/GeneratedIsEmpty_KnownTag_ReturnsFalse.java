package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedIsEmpty_KnownTag_ReturnsFalse {

    @Test
    public void isEmpty_KnownTag_ReturnsFalse() {
        String tagName = "p";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertFalse(tag.isEmpty());
    }

}