package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedNormalName_NonSimpleTag_ReturnsNormalizedName {

    @Test
    public void normalName_NonSimpleTag_ReturnsNormalizedName() {
        when(Tag.valueOf("<div>", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("<div>", null).normalName(), is("div"));
    }

}