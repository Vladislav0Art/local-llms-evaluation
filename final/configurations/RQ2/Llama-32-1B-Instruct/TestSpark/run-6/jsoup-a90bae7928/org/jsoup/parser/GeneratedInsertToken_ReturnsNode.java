package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedInsertToken_ReturnsNode {

    @Mock
    private Element contextElement;

    @Mock
    private Token commentToken;

    @Mock
    private Token characterToken;

    @Mock
    private Token endTagToken;

    @Test
    public void insertToken_ReturnsNode() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token("token1");
        // Act
        Node node = xmlTreeBuilder.insertToken(token).insert(contextElementMock).parse("test");
        // Assert
        assertEquals(node, Mockito.times(1).anyOf(xmlTreeBuilder.insertToken(token)));
    }

}