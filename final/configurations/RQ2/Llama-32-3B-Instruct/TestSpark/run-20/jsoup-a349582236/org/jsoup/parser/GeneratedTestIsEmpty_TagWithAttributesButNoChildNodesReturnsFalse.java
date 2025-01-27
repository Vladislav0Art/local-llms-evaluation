package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTestIsEmpty_TagWithAttributesButNoChildNodesReturnsFalse {

    @Test
    public void testIsEmpty_TagWithAttributesButNoChildNodesReturnsFalse() {
        assertFalse(Tag.isEmpty("<tag attr>"));
    }

}