package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_NoEmptyTagInstance {

    @Test
    public void isEmpty_NoEmptyTagInstance() {
        String tagName = "div";
        assertFalse(Tag.valueOf(tagName).isEmpty());
    }

}