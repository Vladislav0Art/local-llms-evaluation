package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAsXmlDeclaration_RetrievesCorrectValue {

    @Test
    public void asXmlDeclaration_RetrievesCorrectValue() {
        // Given
        String data = "test";
        when(Document.htmlParser().settings(ParseSettings.preserveCase).parseInput("<" + data + ">", baseUri())).thenReturn(createDoc(data));

        Comment comment = new Comment(data);

        // When
        XmlDeclaration result = comment.asXmlDeclaration();

        // Then
        assertNotNull(result);
    }

    private Document createDoc(String data) {
        return mock(Document.class);
    }

}