package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetData_SetsDataCorrectly {

    @Test
    public void getData_SetsDataCorrectly() {
        // Arrange
        Comment comment = new Comment("");
        String data = "test";

        // Act
        comment.setData(data);

        // Assert
        assertNotNull(comment.getData());
        assertTrue(comment.getData().equals(data));
    }

}