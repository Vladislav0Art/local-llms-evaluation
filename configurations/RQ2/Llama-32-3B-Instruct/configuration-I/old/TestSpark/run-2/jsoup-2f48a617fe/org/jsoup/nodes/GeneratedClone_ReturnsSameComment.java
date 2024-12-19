package org.jsoup.nodes;

public class GeneratedClone_ReturnsSameComment {

    @Test
    public void clone_ReturnsSameComment() {
        // Arrange
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();

        // Act

        // Assert
        assertEquals(comment, clonedComment);
    }

}