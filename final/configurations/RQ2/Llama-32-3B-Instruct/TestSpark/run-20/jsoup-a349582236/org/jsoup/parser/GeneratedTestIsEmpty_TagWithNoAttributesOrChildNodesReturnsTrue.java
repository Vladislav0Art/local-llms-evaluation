package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTestIsEmpty_TagWithNoAttributesOrChildNodesReturnsTrue {

    @Test
    public void testIsEmpty_TagWithNoAttributesOrChildNodesReturnsTrue() {
        assertTrue(Tag.isEmpty("<tag>"));
    }

}