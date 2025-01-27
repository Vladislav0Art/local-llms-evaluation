package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTag_KnownTagsReturnTrue {

    @Test
    public void isKnownTag_KnownTagsReturnTrue() {
        String tagName = "p";
        assertTrue(Tag.isKnownTag(tagName));
    }

}