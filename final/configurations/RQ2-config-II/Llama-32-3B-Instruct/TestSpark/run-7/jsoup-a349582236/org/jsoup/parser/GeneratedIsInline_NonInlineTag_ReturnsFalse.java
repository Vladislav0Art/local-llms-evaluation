package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_NonInlineTag_ReturnsFalse {

    @Test
    public void isInline_NonInlineTag_ReturnsFalse() {
        Tag tag = new Tag();
        tag.setName("div");
        Validate.assertFalse(tag.isInline());
    }

}