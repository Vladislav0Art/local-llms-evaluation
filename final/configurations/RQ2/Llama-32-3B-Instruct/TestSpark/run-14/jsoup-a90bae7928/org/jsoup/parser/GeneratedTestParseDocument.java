package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestParseDocument {

    @Test
    public void testParseDocument() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String document = "<root><child/></root>";
        when(xmlTreeBuilder.parseDocument(any(String.class))).thenReturn(null);

        // Act & Assert
        assertEquals(null, xmlTreeBuilder.parseDocument(document));
    }

}