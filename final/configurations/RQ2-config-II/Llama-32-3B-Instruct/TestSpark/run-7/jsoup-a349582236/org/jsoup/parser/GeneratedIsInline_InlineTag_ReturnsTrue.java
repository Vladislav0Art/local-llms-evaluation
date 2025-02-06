package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_InlineTag_ReturnsTrue {

    @Test
    public void isInline_InlineTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("a");
        Validate.isTrue(tag.isInline());
    }

}