package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedIsInline {

    @Test
    public void isInline() {
        String tagName = "span";
        Tag tag = new Tag(tagName);
        boolean result = tag.isInline();
        assertThat(result, is(true));
    }

}