package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsInline_TagWithInlineAttributeReturnsTrue {

    @Test
    public void isInline_TagWithInlineAttributeReturnsTrue() {
        assertTrue(Tag.isInline("span"));
    }

}