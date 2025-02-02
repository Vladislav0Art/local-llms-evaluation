package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNodeName_ReturnsCorrectValue {

    @Test
    public void nodeName_ReturnsCorrectValue() {
        // Given
        Comment comment = new Comment("data");

        // When
        String result = comment.nodeName();

        // Then
        assertEquals("#comment", result);
    }

}