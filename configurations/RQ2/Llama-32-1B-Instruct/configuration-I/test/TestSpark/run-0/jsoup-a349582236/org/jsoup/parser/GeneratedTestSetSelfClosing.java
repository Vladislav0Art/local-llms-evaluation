package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import org.jsoup.Jsoup;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.nodes.Document;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestSetSelfClosing {

    @Test
    public void testSetSelfClosing() {
        Tag tag1 = mock(Tag.class);
        Tag tag2 = mock(Tag.class);

        when(tag1.isBlock()).thenReturn(false);
        when(tag2.isBlock()).thenReturn(true);

        when(tag1.setSelfClosing()).thenReturn(tag2);
        assertEquals(tag2, tag1.setSelfClosing());
    }

}