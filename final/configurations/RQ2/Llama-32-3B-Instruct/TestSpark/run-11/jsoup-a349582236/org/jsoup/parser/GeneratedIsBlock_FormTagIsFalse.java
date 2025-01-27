package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_FormTagIsFalse {

    @Test
    public void isBlock_FormTagIsFalse() {
        String tagName = "a";
        assertFalse(Tag.valueOf(tagName).isBlock());
    }

}