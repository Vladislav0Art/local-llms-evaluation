package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCommentDataConstructorTest {

    @Test
    public void commentDataConstructorTest() {
        // Arrange
        String data = "some data";

        // Act
        Comment comment = new Comment(data);

        // Assert
        assertEquals(data, comment.getData());
    }

}