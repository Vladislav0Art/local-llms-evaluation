package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedIsFormSubmittable {

    @Test
    public void isFormSubmittable() {
        String tagName = "input[type='submit']";
        Tag tag = new Tag(tagName);
        boolean result = tag.isFormSubmittable();
        assertThat(result, is(true));
    }

}