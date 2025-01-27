package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTestIsSelfClosing_TagWithSelfClosingAttributeReturnsTrue {

    @Test
    public void testIsSelfClosing_TagWithSelfClosingAttributeReturnsTrue() {
        assertTrue(Tag.isSelfClosing("img"));
    }

}