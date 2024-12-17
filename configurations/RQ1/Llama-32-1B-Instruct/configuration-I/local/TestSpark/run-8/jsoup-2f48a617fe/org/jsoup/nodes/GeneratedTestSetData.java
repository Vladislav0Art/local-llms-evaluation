package org.jsoup.nodes;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        // Arrange
        String data = "#comment";
        Comment comment = new Comment(data);

        // Act
        comment.setData("New content.");

        // Assert
        assertEquals("New content.", comment.getData());
    }

}