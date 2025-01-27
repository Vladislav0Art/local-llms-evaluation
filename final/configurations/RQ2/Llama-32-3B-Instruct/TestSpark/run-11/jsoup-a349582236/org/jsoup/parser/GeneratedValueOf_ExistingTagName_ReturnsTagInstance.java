package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_ExistingTagName_ReturnsTagInstance {

    @Test
    public void valueOf_ExistingTagName_ReturnsTagInstance() {
        String tagName = "a";
        Tag tag = Tag.valueOf(tagName);
        assertNotNull(tag);
    }

}