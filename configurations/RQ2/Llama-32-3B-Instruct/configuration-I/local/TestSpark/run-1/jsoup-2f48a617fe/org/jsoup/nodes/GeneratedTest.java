package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testComment() {
        // Arrange
        Comment comment = new Comment("COMMENT");

        // Act
        assertNotNull(comment);

        // Assert
        assertEquals("COMMENT", comment.nodeName());
    }

}