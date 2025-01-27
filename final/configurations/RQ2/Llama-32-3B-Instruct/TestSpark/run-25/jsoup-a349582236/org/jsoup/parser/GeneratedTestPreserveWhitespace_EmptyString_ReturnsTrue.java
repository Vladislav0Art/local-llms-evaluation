package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestPreserveWhitespace_EmptyString_ReturnsTrue {

    @Test
    public void testPreserveWhitespace_EmptyString_ReturnsTrue() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertThat(tag.preserveWhitespace(), is(true));
    }

}