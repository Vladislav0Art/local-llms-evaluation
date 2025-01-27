package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTestGetName_NullStringThrowsNullPointerException {

    @Test
    public void testGetName_NullStringThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Tag.getName(null));
    }

}