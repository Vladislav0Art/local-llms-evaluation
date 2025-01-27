package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTestIsInline_TagWithoutInlineAttributeReturnsFalse {

    @Test
    public void testIsInline_TagWithoutInlineAttributeReturnsFalse() {
        assertFalse(Tag.isInline("div"));
    }

}