package org.jsoup.nodes;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        // Arrange
        String data = "#comment";

        // Act
        Comment comment = new Comment(data);

        // Assert
        assertEquals("#comment", comment.nodeName());
    }

}