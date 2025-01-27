package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormListed_defaultValue {

    public static void testGetName() {
        Tag tag = new Tag();
        String result = tag.getName();
        assertNotNull(result);
    }

    @Test
    public void isFormListed_defaultValue() {
        Tag tag = new Tag();
        boolean result = tag.isFormListed();
        assertTrue(result);
    }

    public static void testPreserveWhitespace_false() {
        Tag tag = new Tag();
        assertFalse(tag.preserveWhitespace());
    }
}

}