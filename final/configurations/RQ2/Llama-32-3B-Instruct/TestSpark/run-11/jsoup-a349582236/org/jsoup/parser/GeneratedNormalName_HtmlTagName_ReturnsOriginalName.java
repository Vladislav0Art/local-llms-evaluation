package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_HtmlTagName_ReturnsOriginalName {

    @Test
    public void normalName_HtmlTagName_ReturnsOriginalName() {
        String tagName = "html";
        assertEquals(tagName, Tag.valueOf(tagName).normalName());
    }

}