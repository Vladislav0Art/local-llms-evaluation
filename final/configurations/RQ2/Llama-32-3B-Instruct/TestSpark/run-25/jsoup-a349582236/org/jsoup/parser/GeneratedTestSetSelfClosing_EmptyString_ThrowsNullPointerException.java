package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestSetSelfClosing_EmptyString_ThrowsNullPointerException {

    @Test
    public void testSetSelfClosing_EmptyString_ThrowsNullPointerException() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertThrows(NullPointerException.class, () -> tag.setSelfClosing());
    }

}