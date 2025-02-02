package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsXmlDeclaration_ReturnsCorrectValue {

    @Test
    public void isXmlDeclaration_ReturnsCorrectValue() {
        // Given
        String data = "test";
        when(Document.htmlParser().settings(ParseSettings.preserveCase).parseInput("<" + data + ">", baseUri())).thenReturn(createDoc(data));

        Comment comment = new Comment(data);

        // When
        boolean result = comment.isXmlDeclaration();

        // Then
        assertTrue(result);
    }

}