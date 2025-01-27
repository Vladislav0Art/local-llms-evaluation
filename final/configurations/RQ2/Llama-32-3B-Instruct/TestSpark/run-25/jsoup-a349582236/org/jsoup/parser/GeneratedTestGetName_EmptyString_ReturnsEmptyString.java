package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestGetName_EmptyString_ReturnsEmptyString {

    @Test
    public void testGetName_EmptyString_ReturnsEmptyString() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertThat(tag.getName(), is(""));
    }

}