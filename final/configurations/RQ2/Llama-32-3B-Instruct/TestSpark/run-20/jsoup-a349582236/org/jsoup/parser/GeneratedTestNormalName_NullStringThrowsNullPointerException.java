package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTestNormalName_NullStringThrowsNullPointerException {

    @Test
    public void testNormalName_NullStringThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Tag.normalName(null));
    }

}