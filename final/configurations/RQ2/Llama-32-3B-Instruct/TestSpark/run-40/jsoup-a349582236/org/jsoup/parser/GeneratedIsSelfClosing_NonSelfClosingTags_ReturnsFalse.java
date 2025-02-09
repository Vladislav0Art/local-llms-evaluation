package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsSelfClosing_NonSelfClosingTags_ReturnsFalse {

    @Test
    public void isSelfClosing_NonSelfClosingTags_ReturnsFalse() {
        String tagName = "div";
        assertFalse(Tag.valueOf(tagName).isSelfClosing());
    }

}