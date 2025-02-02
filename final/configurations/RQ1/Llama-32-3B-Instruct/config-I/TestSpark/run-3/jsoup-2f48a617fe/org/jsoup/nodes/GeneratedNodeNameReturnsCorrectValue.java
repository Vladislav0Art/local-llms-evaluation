package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedNodeNameReturnsCorrectValue {

    @Test
    public void nodeNameReturnsCorrectValue() {
        // Given
        String data = "data";
        Comment comment = new Comment(data);

        // When
        String result = comment.nodeName();

        // Then
        assertEquals("#comment", result);
    }

}