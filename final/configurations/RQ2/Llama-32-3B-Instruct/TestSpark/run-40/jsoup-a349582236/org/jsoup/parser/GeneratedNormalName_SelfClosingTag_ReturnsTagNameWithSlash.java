package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedNormalName_SelfClosingTag_ReturnsTagNameWithSlash {

    @Test
    public void normalName_SelfClosingTag_ReturnsTagNameWithSlash() {
        String tagName = "img";
        Tag tag = new Tag(tagName);
        assertEquals(tagName + "/", tag.normalName());
    }

}