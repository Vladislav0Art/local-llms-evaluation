package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespace_NormalTags_PreservesWhitespace {

    @Test
    public void preserveWhitespace_NormalTags_PreservesWhitespace() {
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.preserveWhitespace());
    }

}