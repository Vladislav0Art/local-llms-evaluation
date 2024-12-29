package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedEqualsUnknown {

    @Test
    public void equalsUnknown() {
        String tagName = "div";
        Tag tag1 = new Tag(tagName);
        Tag tag2 = mock(Tag.class);
        when(Tag.class.valueOf(tagName)).thenReturn(tag1);

        boolean result = tag1.equals(tag2);
        assertThat(result, is(false));
    }

}