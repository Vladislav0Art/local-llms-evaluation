package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_FormTagsAreFalse {

    @Test
    public void isInline_FormTagsAreFalse() {
        String tagName = "span";
        assertFalse(Tag.valueOf(tagName).isInline());
    }

}