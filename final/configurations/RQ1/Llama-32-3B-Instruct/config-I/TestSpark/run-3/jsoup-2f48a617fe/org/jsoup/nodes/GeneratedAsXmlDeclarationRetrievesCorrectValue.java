package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedAsXmlDeclarationRetrievesCorrectValue {

    @Test
    public void asXmlDeclarationRetrievesCorrectValue() {
        // Given
        String data = "test";
        when(Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput("<" + data + ">", baseUri())).thenReturn(mock(Document.class));

        Comment comment = new Comment(data);

        // When
        XmlDeclaration result = comment.asXmlDeclaration();

        // Then
        assertNotNull(result);
    }

    private Document createDoc() {
        return mock(Document.class);
    }

}