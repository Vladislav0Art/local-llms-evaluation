package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsBlock_TagWithBlockAttributeReturnsTrue {

    @Test
    public void isBlock_TagWithBlockAttributeReturnsTrue() {
        assertTrue(Tag.isBlock("div"));
    }

}