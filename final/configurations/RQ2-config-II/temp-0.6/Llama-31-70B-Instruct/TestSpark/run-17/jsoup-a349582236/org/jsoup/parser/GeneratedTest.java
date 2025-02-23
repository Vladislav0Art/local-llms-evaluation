package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private Tag tag;

    @Test
    public void getName_shouldReturnName() {
        tag = Mockito.mock(Tag.class);
        when(tag.getName()).thenReturn("name");

        assertEquals("name", tag.getName());
    }

    @Test
    public void normalName_shouldReturnName() {
        tag = Mockito.mock(Tag.class);
        when(tag.normalName()).thenReturn("name");

        assertEquals("name", tag.normalName());
    }

    @Test
    public void isBlock_shouldReturnTrue() {
        tag = Mockito.mock(Tag.class);
        when(tag.isBlock()).thenReturn(true);

        assertTrue(tag.isBlock());
    }

    @Test
    public void isEmpty_shouldReturnTrue() {
        tag = Mockito.mock(Tag.class);
        when(tag.isEmpty()).thenReturn(true);

        assertTrue(tag.isEmpty());
    }

}