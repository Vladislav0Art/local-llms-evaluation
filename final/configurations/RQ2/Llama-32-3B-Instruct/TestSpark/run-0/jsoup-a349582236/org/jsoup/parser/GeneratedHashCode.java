package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedHashCode {

    @Test
    public void hashCode() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        int expectedHashCode = 102; // assuming HashMap hash code for a string

        when(Tag.class.valueOf(tagName)).thenReturn(tag);

        int actualHashCode = tag.hashCode();
        assertThat(actualHashCode, is(expectedHashCode));
    }

}