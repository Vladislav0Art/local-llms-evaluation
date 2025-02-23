package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedNormalName_shouldReturnName {

    private Tag tag;

    @Test
    public void normalName_shouldReturnName() {
        tag = Mockito.mock(Tag.class);
        when(tag.normalName()).thenReturn("name");

        assertEquals("name", tag.normalName());
    }

}