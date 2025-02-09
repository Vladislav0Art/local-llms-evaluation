package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsSelfClosing_SelfClosingTags_ReturnsTrue {

    @Test
    public void isSelfClosing_SelfClosingTags_ReturnsTrue() {
        String tagName = "img";
        assertTrue(Tag.valueOf(tagName).isSelfClosing());
    }

}