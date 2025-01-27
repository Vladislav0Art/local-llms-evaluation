package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsInline_TagWithoutInlineAttributeReturnsFalse {

    @Test
    public void isInline_TagWithoutInlineAttributeReturnsFalse() {
        assertFalse(Tag.isInline("div"));
    }

}