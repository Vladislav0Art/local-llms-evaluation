package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespace_FormTagsPreserveWhitespaceByDefault {

    @Test
    public void preserveWhitespace_FormTagsPreserveWhitespaceByDefault() {
        String tagName = "span";
        assertFalse(Tag.valueOf(tagName).preserveWhitespace());
    }

}