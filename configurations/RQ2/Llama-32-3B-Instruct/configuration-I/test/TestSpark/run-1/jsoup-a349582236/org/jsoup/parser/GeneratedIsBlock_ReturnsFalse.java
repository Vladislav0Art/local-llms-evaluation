package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlock_ReturnsFalse {

    @Mock
    private ParseSettings settings;

    @Test
    public void isBlock_ReturnsFalse() {
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn("tag");
        boolean actual = tag.isBlock();
        org.junit.Assert.assertFalse(actual);
    }

}