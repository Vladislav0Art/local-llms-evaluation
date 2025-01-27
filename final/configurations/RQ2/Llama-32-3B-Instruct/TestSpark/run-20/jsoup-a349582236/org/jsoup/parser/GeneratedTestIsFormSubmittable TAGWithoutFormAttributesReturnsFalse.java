package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTestIsFormSubmittable TAGWithoutFormAttributesReturnsFalse {

    @Test
    public void testIsFormSubmittable

    TAGWithoutFormAttributesReturnsFalse() {
        assertFalse(Tag.isFormSubmitted("", "<form>"));
    }

}