package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTestIsBlock_TagWithoutBlockAttributeReturnsFalse {

    @Test
    public void testIsBlock_TagWithoutBlockAttributeReturnsFalse() {
        assertFalse(Tag.isBlock("p"));
    }

}