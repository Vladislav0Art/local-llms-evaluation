package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_BlockTagIsTrue {

    @Test
    public void isBlock_BlockTagIsTrue() {
        String tagName = "p";
        assertTrue(Tag.valueOf(tagName).isBlock());
    }

}