package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsEmpty_SelfClosingTagIsNotEmpty {

    @Test
    public void isEmpty_SelfClosingTagIsNotEmpty() {
        assertTrue(Tag.isSelfClosing("img"));
    }

}