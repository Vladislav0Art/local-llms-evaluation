package org.jsoup.nodes;

public class GeneratedTestGetData {

    @Test
    public void testGetData() {
        // Arrange
        String data = "This is a sample comment.";

        // Act
        Comment comment = new Comment(data);
        String actualData = comment.getData();

        // Assert
        assertEquals("This is a sample comment.", actualData);
    }

}