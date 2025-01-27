package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsInline_EmptyString_ReturnsFalse {

    @Test
    public void testIsInline_EmptyString_ReturnsFalse() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertThat(tag.isInline(), is(false));
    }

}