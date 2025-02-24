package org.jsoup.nodes;

public class GeneratedNodeNameTest {

    private Comment comment;

    @Test
    public void nodeNameTest() {
        // Arrange
        comment = new Comment("data");

        // Act
        String nodeName = comment.nodeName();

        // Assert
        assertEquals("#comment", nodeName);
    }

}