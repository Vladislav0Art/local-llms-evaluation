package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_SelfClosingTagsBecomeTrue {

    @Test
    public void setSelfClosing_SelfClosingTagsBecomeTrue() throws InterruptedException {
        String tagName = "img";
        Tag tag = Tag.valueOf(tagName);
        boolean result = tag.setSelfClosing();
        assertTrue(result);
    }

}