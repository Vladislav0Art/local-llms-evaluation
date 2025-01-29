package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedInitialiseParse_ReturnsParserSettings {

    @Mock
    private Element contextElement;

    @Mock
    private Token commentToken;

    @Mock
    private Token characterToken;

    @Mock
    private Token endTagToken;

    @Test
    public void initialiseParse_ReturnsParserSettings() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String baseUri = "test";
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.getBaseUri()).thenReturn(baseUri);
        // Act
        ParseSettings defaultSettings = xmlTreeBuilder.initialiseParse(new StringReader("test"), baseUri, parser);
        // Assert
        assertEquals(defaultSettings, Mockito.times(1).anyOf(xmlTreeBuilder.initialiseParse(new StringReader("test"), baseUri, parser)));
    }

}