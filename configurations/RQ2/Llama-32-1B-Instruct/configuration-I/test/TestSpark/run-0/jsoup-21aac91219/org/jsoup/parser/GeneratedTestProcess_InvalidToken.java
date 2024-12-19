package org.jsoup.parser;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.Before;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestProcess_InvalidToken {

    private final HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();

    @Before
    public void setup() {
        when(htmlTreeBuilder.baseUri()).thenReturn("https://example.com");
    }

    @Test
    public void testProcess_InvalidToken() {
        String inputToken = "<a href=\"https://www.example.com\">Example</a>";
        Element element = mock(Element.class);

        // No exception should be thrown when processing an invalid token.
        htmlTreeBuilder.process(inputToken);
        verify(element).setTextContent(null);
    }

}