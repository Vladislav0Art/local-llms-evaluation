package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedFormatAsBlock_ValidTagIsBlock_ReturnsTrue {

    @Test
    public void formatAsBlock_ValidTagIsBlock_ReturnsTrue() {
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.formatAsBlock());
    }

}