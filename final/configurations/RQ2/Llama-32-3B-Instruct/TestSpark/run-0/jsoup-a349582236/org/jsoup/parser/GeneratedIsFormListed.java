package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedIsFormListed {

    @Test
    public void isFormListed() {
        String tagName = "form";
        Tag tag = new Tag(tagName);
        boolean result = tag.isFormListed();
        assertThat(result, is(false));
    }

}