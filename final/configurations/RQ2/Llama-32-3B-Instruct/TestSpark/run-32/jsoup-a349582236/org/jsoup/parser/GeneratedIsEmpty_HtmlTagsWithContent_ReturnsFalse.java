package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedIsEmpty_HtmlTagsWithContent_ReturnsFalse {

    @Test
    public void isEmpty_HtmlTagsWithContent_ReturnsFalse() {
        String tagName = "p";
        Tag tag = new Tag(tagName);
        assertFalse(tag.isEmpty());
    }

}