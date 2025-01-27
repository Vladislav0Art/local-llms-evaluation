package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedGetName_EmptyTagName_ReturnsEmptyString {

    @Test
    public void getName_EmptyTagName_ReturnsEmptyString() {
        when(Tag.valueOf("", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("", null).getName(), is(""));
    }

}