package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsSelfClosing_TagWithSelfClosingAttributeReturnsTrue {

    @Test
    public void isSelfClosing_TagWithSelfClosingAttributeReturnsTrue() {
        assertTrue(Tag.isSelfClosing("img"));
    }

}