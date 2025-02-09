package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedSetSelfClosing_NonSelfClosingTags_ReturnsFalse {

    @Test
    public void setSelfClosing_NonSelfClosingTags_ReturnsFalse() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        assertFalse(tag.setSelfClosing());
    }

}