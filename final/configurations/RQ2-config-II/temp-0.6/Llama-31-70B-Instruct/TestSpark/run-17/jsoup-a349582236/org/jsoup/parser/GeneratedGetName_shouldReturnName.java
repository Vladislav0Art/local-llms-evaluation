package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedGetName_shouldReturnName {

    private Tag tag;

    @Test
    public void getName_shouldReturnName() {
        tag = Mockito.mock(Tag.class);
        when(tag.getName()).thenReturn("name");

        assertEquals("name", tag.getName());
    }

}