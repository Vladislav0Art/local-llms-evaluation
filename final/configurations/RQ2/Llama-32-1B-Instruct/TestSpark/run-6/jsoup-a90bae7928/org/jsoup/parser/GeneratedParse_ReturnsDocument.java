package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedParse_ReturnsDocument {

    @Mock
    private Element contextElement;

    @Mock
    private Token commentToken;

    @Mock
    private Token characterToken;

    @Mock
    private Token endTagToken;

    @Test
    public void parse_ReturnsDocument() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "test";
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.parse(input)).thenReturn(new Document("test"));
        // Act
        Element element = xmlTreeBuilder.parse(input, "test").insert(contextElement).parse("test");
        // Assert
        assertEquals(element, Mockito.times(1).anyOf(xmlTreeBuilder.parse(input, "test")));
    }

}