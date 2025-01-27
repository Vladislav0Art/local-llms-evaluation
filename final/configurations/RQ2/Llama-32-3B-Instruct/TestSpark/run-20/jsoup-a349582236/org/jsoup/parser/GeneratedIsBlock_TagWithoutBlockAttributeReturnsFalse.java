package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsBlock_TagWithoutBlockAttributeReturnsFalse {

    @Test
    public void isBlock_TagWithoutBlockAttributeReturnsFalse() {
        assertFalse(Tag.isBlock("p"));
    }

}