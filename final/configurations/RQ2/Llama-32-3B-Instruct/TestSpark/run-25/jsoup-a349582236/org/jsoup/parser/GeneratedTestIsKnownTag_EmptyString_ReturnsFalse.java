package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsKnownTag_EmptyString_ReturnsFalse {

    @Test
    public void testIsKnownTag_EmptyString_ReturnsFalse() {
        String tagName = "";
        boolean result = Tag.isKnownTag(tagName);
        assertThat(result, is(false));
    }

}