package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedIsInline_InlineTagsAreInlines {

    @Test
    public void isInline_InlineTagsAreInlines() {
        when(Tag.valueOf("<a>", null)).thenReturn(new Tag());
        when(Tag.valueOf("<span>", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("<a>", null).isInline(), is(true));
        assertThat(Tag.valueOf("<span>", null).isInline(), is(true));
    }

}