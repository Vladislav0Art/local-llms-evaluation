package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        // Arrange
        String data = "#comment";
        Comment expected = new Comment(data);
        Appendable accum = new StringBuilder();
        Document OutputSettings = Document.OutputSettings.create();

        // Act
        Comment clone = comment.clone();

        // Assert
        assertEquals(expected, clone);
    }

}