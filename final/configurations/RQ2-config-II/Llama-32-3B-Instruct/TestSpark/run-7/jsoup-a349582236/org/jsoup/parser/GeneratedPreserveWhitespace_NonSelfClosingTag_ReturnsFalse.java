package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespace_NonSelfClosingTag_ReturnsFalse {

    @Test
    public void preserveWhitespace_NonSelfClosingTag_ReturnsFalse() {
        Tag tag = new Tag();
        Validate.assertFalse(tag.preserveWhitespace());
    }

}