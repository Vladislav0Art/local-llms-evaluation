package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedToStringMethodTest {

    @Test
    public void toStringMethodTest() {
        // Arrange
        Comment comment = new Comment("some data");

        // Act
        String toString = comment.toString();

        // Assert
        assertEquals("<!-- some data -->", toString);
    }

}