package org.jsoup.nodes;

public class GeneratedSetData_ReturnsCorrectValue {

    @Test
    public void setData_ReturnsCorrectValue() {
        // Arrange
        Comment comment = new Comment("");

        // Act
        String actual = comment.setData(null);

        // Assert
        assertNull(actual);
    }

}