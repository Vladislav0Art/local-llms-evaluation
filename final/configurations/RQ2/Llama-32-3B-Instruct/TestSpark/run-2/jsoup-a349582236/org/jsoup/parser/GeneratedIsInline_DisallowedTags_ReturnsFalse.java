package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_DisallowedTags_ReturnsFalse {

    @Test
    public void isInline_DisallowedTags_ReturnsFalse() {
        String tagName = "div";
        assertFalse(Tag.isInline(tagName));
    }

}