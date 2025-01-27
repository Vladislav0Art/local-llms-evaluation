package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_SelfClosingTagsAreFalseByDefault {

    @Test
    public void isSelfClosing_SelfClosingTagsAreFalseByDefault() {
        String tagName = "img";
        assertFalse(Tag.valueOf(tagName).isSelfClosing());
    }

}