package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestGetValueOf_EmptyString_ThrowsNullPointerException {

    @Test
    public void testGetValueOf_EmptyString_ThrowsNullPointerException() {
        String tagName = "";
        ParseSettings settings = new ParseSettings();
        assertThrows(NullPointerException.class, () -> Tag.valueOf(tagName, settings));
        assertThrows(NullPointerException.class, () -> Tag.valueOf(tagName));
    }

}