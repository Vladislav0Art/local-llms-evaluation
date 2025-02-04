package org.jsoup.nodes;

public class GeneratedClone_isCorrect {

    @Test
    public void clone_isCorrect() {
        // Given
        Comment comment = new Comment("This is a comment");

        // When
        Comment clonedComment = comment.clone();

        // Then
        assertEquals(comment, clonedComment);
    }

}