package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_AllowedTags_ReturnsTrue {

    @Test
    public void isBlock_AllowedTags_ReturnsTrue() {
        String tagName = "p";
        assertTrue(Tag.isBlock(tagName));
    }

}