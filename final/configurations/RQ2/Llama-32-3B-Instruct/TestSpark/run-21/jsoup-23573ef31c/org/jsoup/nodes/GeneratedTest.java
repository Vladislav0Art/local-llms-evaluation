package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @org.junit.Test
    public void testConnection() {
        // Arrange
        Connection connection = new Connection();
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.connection()).thenReturn(connection);

        // Act

        // Assert
        assertEquals(connection, document.connection());
    }

    @org.junit.Test
    public void testCreateElement() {
        // Arrange
        String tagName = "test";
        Element element = new Element(tagName);
        Document.Document createElement = Mockito.mock(Document.class);
        Mockito.when(createElement.createElement(tagName)).thenReturn(element);

        // Act

        // Assert
        assertEquals(element, createElement.createElement(tagName));
    }

    @org.junit.Test
    public void testText() {
        // Arrange
        String text = "test";
        Element element = new Element();
        Document.Document textMock = Mockito.mock(Document.class);
        Mockito.when(textMock.text(text, element)).thenReturn(element);

        // Act

        // Assert
        assertEquals(element, textMock.text(text, element));
    }

    @org.junit.Test
    public void testNodeName() {
        // Arrange
        String nodeName = "test";
        Document.Document nodeNameMock = Mockito.mock(Document.class);
        Mockito.when(nodeNameMock.nodeName(nodeName)).thenReturn(nodeName);

        // Act

        // Assert
        assertEquals(nodeName, nodeNameMock.nodeName(nodeName));
    }

}