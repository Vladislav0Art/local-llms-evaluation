package org.jsoup.nodes;

public class GeneratedGetDataTest {

    private Comment comment;

    @Test
    public void getDataTest() {
        // Arrange
        comment = new Comment("data");

        // Act
        String data = comment.getData();

        // Assert
        assertEquals("data", data);
    }

}