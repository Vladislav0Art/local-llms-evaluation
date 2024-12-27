package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParserSettings;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedParseFragmentFindsElementInDocument {

    private HtmlTreeBuilder htmlTreeBuilder;

    @Before
    public void setUp() {
        htmlTreeBuilder = new HtmlTreeBuilder();
    }

    @Test
    public void parseFragmentFindsElementInDocument() {
        // Arrange
        Document document = new Document();
        String inputFragment = "<html><body>Hello World!</body></html>";
        Element element = Mockito.mock(Element.class);

        // Act
        List<Node> result = htmlTreeBuilder.parseFragment(inputFragment, null, "", null);
        assertTrue(result.contains(element));
    }

}