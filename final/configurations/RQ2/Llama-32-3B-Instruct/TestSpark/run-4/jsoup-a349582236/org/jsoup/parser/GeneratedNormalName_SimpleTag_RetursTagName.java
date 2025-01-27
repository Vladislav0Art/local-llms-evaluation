package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedNormalName_SimpleTag_RetursTagName {

    @Test
    public void normalName_SimpleTag_RetursTagName() {
        when(Tag.valueOf("p", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("p", null).normalName(), is("p"));
    }

}