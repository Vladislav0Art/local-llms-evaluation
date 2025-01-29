package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedInsertCharacterToken_ReturnsNode {

    @Mock
    private Element contextElement;

    @Mock
    private Token commentToken;

    @Mock
    private Token characterToken;

    @Mock
    private Token endTagToken;

    @Test
    public void insertCharacterToken_ReturnsNode() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token("token1");
        Element nodeElementMock = new Element("test", null);
        Mockito.when(nodeElementMock.getName()).thenReturn("element1");
        // Act
        Node node = xmlTreeBuilder.insertCharacter(token).insertNode(nodeElementMock).parse("test");
        // Assert
        assertEquals(node, Mockito.times(1).anyOf(xmlTreeBuilder.insertCharacter(token)));
    }

}