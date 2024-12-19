package org.jsoup.parser;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.Before;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestParseFragment {

    private final HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();

    @Before
    public void setup() {
        when(htmlTreeBuilder.baseUri()).thenReturn("https://example.com");
    }

    @Test
    public void testParseFragment() {
        String inputFragment = "<div>Hello World!</div>";
        Element context = null;
        Parser parser = mock(Parser.class);
        when(parser.parse(inputFragment)).thenReturn(true);

        htmlTreeBuilder.setBaseUri("https://example.com");
        List<Node> result = htmlTreeBuilder.parseFragment(inputFragment, context, "https://example.com", parser);
        assertNotSame(result, new ArrayList<>());
    }

}