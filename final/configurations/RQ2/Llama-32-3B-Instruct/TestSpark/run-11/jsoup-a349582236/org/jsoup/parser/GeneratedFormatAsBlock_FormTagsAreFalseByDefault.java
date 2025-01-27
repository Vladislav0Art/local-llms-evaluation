package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_FormTagsAreFalseByDefault {

    @Test
    public void formatAsBlock_FormTagsAreFalseByDefault() {
        String tagName = "a";
        assertFalse(Tag.valueOf(tagName).formatAsBlock());
    }

}