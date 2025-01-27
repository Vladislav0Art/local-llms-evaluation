package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewNodeCreatesCommentWithData {

    @Test
    public void newNodeCreatesCommentWithData() {
        // Given
        String data = "expectedData";

        // When
        Comment comment = new Comment(data);

        // Then
        assertEquals(data, comment.getData());
    }

}