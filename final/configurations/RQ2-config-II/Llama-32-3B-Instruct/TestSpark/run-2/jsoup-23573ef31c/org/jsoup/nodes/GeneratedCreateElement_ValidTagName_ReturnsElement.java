package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateElement_ValidTagName_ReturnsElement {

    @Test
    public void createElement_ValidTagName_ReturnsElement() {
        // Arrange
        Document document = new Document("http://example.com");
        Element element = Mockito.mock(Element.class);
        when(document.createElement("div")).thenReturn(element);

        // Act & Assert
        assertEquals(element, document.createElement("div"));
    }

}