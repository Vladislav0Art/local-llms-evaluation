package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedPreserveWhitespace {

    @Test
    public void preserveWhitespace() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        boolean result = tag.preserveWhitespace();
        assertThat(result, is(true));
    }

}