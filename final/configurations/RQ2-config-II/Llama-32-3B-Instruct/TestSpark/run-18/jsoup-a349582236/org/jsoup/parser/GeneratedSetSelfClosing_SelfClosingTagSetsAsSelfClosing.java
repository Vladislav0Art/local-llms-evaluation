package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedSetSelfClosing_SelfClosingTagSetsAsSelfClosing {

    @Test
    public void setSelfClosing_SelfClosingTagSetsAsSelfClosing() {
        Tag tag = new Tag();
        tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

}