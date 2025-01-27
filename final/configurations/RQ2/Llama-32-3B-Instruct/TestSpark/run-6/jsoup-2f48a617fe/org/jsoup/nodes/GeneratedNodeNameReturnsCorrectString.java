package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNodeNameReturnsCorrectString {

    @Test
    public void nodeNameReturnsCorrectString() {
        // Given
        Comment comment = new Comment("test");

        // When
        String expectedNodeName = "COMMENT";

        // Then
        assertEquals(expectedNodeName, comment.nodeName());
    }

}