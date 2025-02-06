package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTag_KnownTag_ReturnsTrue {

    @Test
    public void isKnownTag_KnownTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("a");
        Validate.isTrue(Tag.isKnownTag(tag.getName()));
    }

}