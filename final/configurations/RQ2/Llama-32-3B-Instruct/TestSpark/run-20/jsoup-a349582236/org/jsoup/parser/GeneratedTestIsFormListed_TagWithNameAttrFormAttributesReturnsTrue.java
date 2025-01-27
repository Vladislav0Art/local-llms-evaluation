package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTestIsFormListed_TagWithNameAttrFormAttributesReturnsTrue {

    @Test
    public void testIsFormListed_TagWithNameAttrFormAttributesReturnsTrue() {
        assertTrue(Tag.isFormListed("<form><tag>"));
    }

}