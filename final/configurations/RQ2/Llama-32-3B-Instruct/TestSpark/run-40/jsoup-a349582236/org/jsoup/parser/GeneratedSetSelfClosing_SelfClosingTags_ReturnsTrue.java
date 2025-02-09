package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedSetSelfClosing_SelfClosingTags_ReturnsTrue {

    @Test
    public void setSelfClosing_SelfClosingTags_ReturnsTrue() {
        Tag tag = new Tag("img");
        assertTrue(tag.setSelfClosing());
    }

}