package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedNewInstance_ReturnsElement {

    @Mock
    private Element contextElement;

    @Mock
    private Token commentToken;

    @Mock
    private Token characterToken;

    @Mock
    private Token endTagToken;

    @Test
    public void newInstance_ReturnsElement() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        // Act
        Element element = xmlTreeBuilder.newInstance().insert(contextElement).parse("test");
        // Assert
        assertEquals(element, Mockito.times(1).anyOf(xmlTreeBuilder.newInstance().insert(contextElement)));
    }

}