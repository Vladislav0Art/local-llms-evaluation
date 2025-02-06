package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_EmptyString_ReturnsTrue {

    @Test
    public void isEmpty_EmptyString_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("");
        Validate.isTrue(tag.isEmpty());
    }

}