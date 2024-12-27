package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInline_ReturnsFalseForBlockTags {

    @Mock
    private ParseSettings settings;

    @Test
    public void isInline_ReturnsFalseForBlockTags() {
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn("div");
        boolean actual = tag.isInline();
        org.junit.Assert.assertFalse(actual);
    }

}