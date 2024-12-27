package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsEmpty_ReturnsFalse {

    @Mock
    private ParseSettings settings;

    @Test
    public void isEmpty_ReturnsFalse() {
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn("tag");
        boolean actual = tag.isEmpty();
        org.junit.Assert.assertFalse(actual);
    }

}