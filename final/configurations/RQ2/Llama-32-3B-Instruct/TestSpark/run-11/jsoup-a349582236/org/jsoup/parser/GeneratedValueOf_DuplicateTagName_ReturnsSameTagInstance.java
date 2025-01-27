package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_DuplicateTagName_ReturnsSameTagInstance {

    @Test
    public void valueOf_DuplicateTagName_ReturnsSameTagInstance() {
        String tagName = "span";
        Tag firstTag = Tag.valueOf(tagName);
        Tag secondTag = Tag.valueOf(tagName);
        assertEquals(firstTag, secondTag);
    }

}