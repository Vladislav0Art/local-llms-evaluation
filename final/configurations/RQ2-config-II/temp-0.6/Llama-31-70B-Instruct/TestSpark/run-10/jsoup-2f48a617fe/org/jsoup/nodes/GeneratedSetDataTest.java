package org.jsoup.nodes;

public class GeneratedSetDataTest {

    private Comment comment;

    @Test
    public void setDataTest() {
        // Arrange
        comment = new Comment("data");
        String newData = "newData";

        // Act
        comment.setData(newData);

        // Assert
        assertEquals(newData, comment.getData());
    }

}