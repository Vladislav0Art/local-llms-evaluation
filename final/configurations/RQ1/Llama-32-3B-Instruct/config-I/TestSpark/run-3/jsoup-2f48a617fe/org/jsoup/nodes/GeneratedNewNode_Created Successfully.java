package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNewNode_Created Successfully {

    @Test
    public void newNode_Created

    Successfully() {
        // Given
        String data = "test";
        when(Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput("<" + data + ">", baseUri())).thenReturn(createDoc(data));

        // When
        Comment comment = new Comment(data);

        // Then
        assertNotNull(comment);
    }

}