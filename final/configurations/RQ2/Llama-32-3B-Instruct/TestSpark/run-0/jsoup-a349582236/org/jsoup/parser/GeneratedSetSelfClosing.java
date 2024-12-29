package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedSetSelfClosing {

    @Test
    public void setSelfClosing() {
        String tagName = "img";
        Tag tag = new Tag(tagName);
        when(Tag.class.valueOf(tagName)).thenReturn(tag);

        Tag actualTag = new Tag(tagName).setSelfClosing();

        verify(tag, times(1)).setName("img");
    }

}