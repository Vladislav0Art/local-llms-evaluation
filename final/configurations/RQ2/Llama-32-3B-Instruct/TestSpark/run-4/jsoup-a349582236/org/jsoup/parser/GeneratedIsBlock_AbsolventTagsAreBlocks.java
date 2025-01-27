package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedIsBlock_AbsolventTagsAreBlocks {

    @Test
    public void isBlock_AbsolventTagsAreBlocks() {
        when(Tag.valueOf("<body>", null)).thenReturn(new Tag());
        when(Tag.valueOf("<html>", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("<body>", null).isBlock(), is(true));
        assertThat(Tag.valueOf("<html>", null).isBlock(), is(true));
    }

}