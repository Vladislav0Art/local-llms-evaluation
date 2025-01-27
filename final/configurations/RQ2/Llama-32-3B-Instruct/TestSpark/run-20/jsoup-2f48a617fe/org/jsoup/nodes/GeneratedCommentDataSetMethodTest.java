package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCommentDataSetMethodTest {

    @Test
    public void commentDataSetMethodTest() {
        // Arrange
        Comment comment = new Comment("some data");
        String newData = "new data";

        // Act
        comment.setData(newData);

        // Assert
        assertEquals(newData, comment.getData());
    }

}