package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedIsEmpty_shouldReturnTrue {

    private Tag tag;

    @Test
    public void isEmpty_shouldReturnTrue() {
        tag = Mockito.mock(Tag.class);
        when(tag.isEmpty()).thenReturn(true);

        assertTrue(tag.isEmpty());
    }

}