package org.jsoup.nodes;

public class GeneratedNewComment_withData_isCreated {

    @Test
    public void newComment_withData_isCreated() {
        // Given
        String data = "This is a comment";

        // When
        Comment comment = new Comment(data);

        // Then
        assertEquals(data, comment.getData());
    }

}