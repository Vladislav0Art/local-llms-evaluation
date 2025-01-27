package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCloneMethodTest {

    @Test
    public void cloneMethodTest() throws CloneNotSupportedException {
        // Arrange
        Comment comment = new Comment("some data");

        // Act
        Comment clonedComment = comment.clone();

        // Assert
        assertNotNull(clonedComment);
    }

}