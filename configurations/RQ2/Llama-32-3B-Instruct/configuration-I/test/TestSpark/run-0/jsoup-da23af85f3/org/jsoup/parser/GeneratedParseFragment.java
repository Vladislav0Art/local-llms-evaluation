package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseFragment {

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private Reader reader;

    @Mock
    private Parser parser;

    @Test
    public void parseFragment() {
        List<Node> expectedNodes = new ArrayList<>();
        // Arrange
        when(parser.parse(any(String.class))).thenReturn(expectedNodes);
        String inputFragment = "fragment";
        Element context = Mockito.mock(Element.class);
        String baseUri = "uri";
        Parser parserInstance = Mockito.mock(Parser.class);

        // Act
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        List<Node> result = htmlTreeBuilder.parseFragment(inputFragment, context, baseUri, parserInstance);

        // Assert
        assertEquals(expectedNodes, result);
    }

}