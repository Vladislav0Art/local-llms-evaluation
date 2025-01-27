package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_NonHtmlTagName_ReturnsNormalizedName {

    @Test
    public void normalName_NonHtmlTagName_ReturnsNormalizedName() {
        String tagName = "div";
        assertEquals("div", Tag.valueOf(tagName).normalName());
    }

}