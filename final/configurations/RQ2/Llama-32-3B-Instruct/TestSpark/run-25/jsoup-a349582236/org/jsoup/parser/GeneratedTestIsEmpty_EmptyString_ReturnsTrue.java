package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsEmpty_EmptyString_ReturnsTrue {

    @Test
    public void testIsEmpty_EmptyString_ReturnsTrue() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertThat(tag.isEmpty(), is(true));
    }

}