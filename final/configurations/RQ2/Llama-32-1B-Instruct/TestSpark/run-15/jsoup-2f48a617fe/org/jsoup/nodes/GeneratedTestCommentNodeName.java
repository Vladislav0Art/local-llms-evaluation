package org.jsoup.nodes;

public class GeneratedTestCommentNodeName {

    @Test
    public void testCommentNodeName() {
        // Arrange
        String data = "Example comment";

        // Act
        Comment comment = new Comment(data);

        // Assert
        assertEquals("comment", comment.nodeName());
    }

}