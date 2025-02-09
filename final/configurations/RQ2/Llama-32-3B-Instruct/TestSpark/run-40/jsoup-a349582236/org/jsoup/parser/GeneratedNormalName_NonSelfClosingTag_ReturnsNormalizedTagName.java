package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedNormalName_NonSelfClosingTag_ReturnsNormalizedTagName {

    @Test
    public void normalName_NonSelfClosingTag_ReturnsNormalizedTagName() {
        String tagName = "div";
        Normalizer normalizer = new Normalizer();
        Tag tag = new Tag(tagName);
        String expectedNormalizedName = normalizer.normalize(tagName);
        assertEquals(expectedNormalizedName, tag.normalName());
    }

}