package org.jsoup.parser;

import org.junit.Before;

import static org.mockito.Mockito.*;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestInsertOnStackAfter {

    private final HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();

    @Before
    public void setup() {
        when(htmlTreeBuilder.baseUri()).thenReturn("https://example.com");
    }

    @Test
    public void testInsertOnStackAfter() {
        Element after = mock(Element.class);
        Element in = mock(Element.class);

        htmlTreeBuilder.insertOnStackAfter(after, in);
        assertNotSame(in, null);
    }

}