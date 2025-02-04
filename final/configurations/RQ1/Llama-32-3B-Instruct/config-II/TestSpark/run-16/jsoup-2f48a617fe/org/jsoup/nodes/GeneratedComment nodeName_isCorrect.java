package org.jsoup.nodes;

public class GeneratedComment nodeName_isCorrect {

    @Test
    public void comment

    nodeName_isCorrect() {
        // Given
        Comment comment = new Comment("This is a comment");

        // When
        String nodeName = comment.nodeName();

        // Then
        assertEquals("#comment", nodeName);
    }

}