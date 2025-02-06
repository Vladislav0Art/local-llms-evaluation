package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTag_UnknownTag_ReturnsFalse {

    @Test
    public void isKnownTag_UnknownTag_ReturnsFalse() {
        Tag tag = new Tag();
        tag.setName("Unknown");
        Validate.assertFalse(Tag.isKnownTag(tag.getName()));
    }

}