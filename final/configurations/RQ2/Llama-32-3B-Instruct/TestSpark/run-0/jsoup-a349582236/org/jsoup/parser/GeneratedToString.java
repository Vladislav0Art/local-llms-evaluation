package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedToString {

    @Test
    public void toString() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        when(Tag.class.valueOf(tagName)).thenReturn(tag);

        String expectedString = "<div>"; // assuming a basic HTML string

        String actualString = tag.toString();
        assertThat(actualString, is(expectedString));
    }

}