package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneReturnsNewCommentWithSameData {

    @Test
    public void cloneReturnsNewCommentWithSameData() {
        // Given
        Comment comment = new Comment("oldData");
        String expectedData = "expectedData";

        // When
        Comment clonedComment = comment.clone();

        // Then
        assertEquals(expectedData, clonedComment.getData());
    }

}