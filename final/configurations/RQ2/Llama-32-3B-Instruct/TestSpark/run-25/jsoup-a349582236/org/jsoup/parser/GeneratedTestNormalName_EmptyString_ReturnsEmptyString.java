package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestNormalName_EmptyString_ReturnsEmptyString {

    @Test
    public void testNormalName_EmptyString_ReturnsEmptyString() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertThat(tag.normalName(), is(""));
    }

}