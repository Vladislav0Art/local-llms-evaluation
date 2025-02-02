package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedNewNodeCreatedSuccessfully {

    @Test
    public void newNodeCreatedSuccessfully() {
        // Given
        String data = "test";
        Document document = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput("<" + data + ">", baseUri());

        // When
        Comment comment = new Comment(data);

        // Then
        assertNotNull(comment);
    }

}