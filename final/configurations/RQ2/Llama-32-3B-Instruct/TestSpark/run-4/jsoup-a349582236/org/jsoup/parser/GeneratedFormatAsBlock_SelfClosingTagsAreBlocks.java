package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedFormatAsBlock_SelfClosingTagsAreBlocks {

    @Test
    public void formatAsBlock_SelfClosingTagsAreBlocks() {
        when(Tag.valueOf("<img src='image.jpg'", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("<img src='image.jpg'", null).formatAsBlock(), is(true));
    }

}