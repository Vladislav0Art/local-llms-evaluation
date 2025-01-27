package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedSetSelfClosing_TagWithSetSelfClosingMethodReturnsTrue {

    @Test
    public void setSelfClosing_TagWithSetSelfClosingMethodReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.setSelfClosing());
    }

}