package org.jsoup.parser;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.Before;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestMarkInsertionMode {

    private final HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();

    @Before
    public void setup() {
        when(htmlTreeBuilder.baseUri()).thenReturn("https://example.com");
    }

    @Test
    public void testMarkInsertionMode() {
        // No exception should be thrown when marking insertion mode.
        htmlTreeBuilder.markInsertionMode();
    }

}