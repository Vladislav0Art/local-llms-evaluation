package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedIsEmpty_EmptyTagName_ReturnsTrue {

    @Test
    public void isEmpty_EmptyTagName_ReturnsTrue() {
        when(Tag.valueOf("", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("", null).isEmpty(), is(true));
    }

}