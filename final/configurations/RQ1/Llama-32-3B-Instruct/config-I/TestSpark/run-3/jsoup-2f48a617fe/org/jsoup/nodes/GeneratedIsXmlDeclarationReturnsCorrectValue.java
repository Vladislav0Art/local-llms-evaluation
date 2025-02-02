package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedIsXmlDeclarationReturnsCorrectValue {

    @Test
    public void isXmlDeclarationReturnsCorrectValue() {
        // Given
        String data = "test";
        when(Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput("<" + data + ">", baseUri())).thenReturn(mock(Document.class));

        Comment comment = new Comment(data);

        // When
        boolean result = comment.isXmlDeclaration();

        // Then
        assertTrue(result);
    }

}