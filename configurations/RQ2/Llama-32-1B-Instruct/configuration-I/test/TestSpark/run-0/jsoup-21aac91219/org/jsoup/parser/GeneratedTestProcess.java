package org.jsoup.parser;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.Before;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestProcess {

    private final HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();

    @Before
    public void setup() {
        when(htmlTreeBuilder.baseUri()).thenReturn("https://example.com");
    }

    @Test
    public void testProcess() {
        String inputToken = "<a href=\"https://www.example.com\">Example</a>";
        Element element = mock(Element.class);
        when(element.getTextContent()).thenReturn(inputToken);

        htmlTreeBuilder.process(inputToken);
        verify(element).setTextContent(inputToken);
    }

}