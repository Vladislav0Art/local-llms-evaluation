package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedIsEmpty {

    @Test
    public void isEmpty() {
        String tagName = "";
        Tag tag = new Tag(tagName);
        boolean result = tag.isEmpty();
        assertThat(result, is(true));
    }

}