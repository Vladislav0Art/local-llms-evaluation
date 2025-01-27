package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCommentNodeNameMethodTest {

    @Test
    public void commentNodeNameMethodTest() {
        // Arrange
        Comment comment = new Comment("some data");

        // Act
        String nodeName = comment.nodeName();

        // Assert
        assertEquals(null, nodeName);
    }

}