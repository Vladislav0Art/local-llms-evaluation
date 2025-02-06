package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_EmptyString_ThrowsIllegalArgumentException {

    @Test
    public void valueOf_EmptyString_ThrowsIllegalArgumentException() {
        AssertException.expect(IllegalArgumentException.class, () -> Tag.valueOf("", null));
    }

}