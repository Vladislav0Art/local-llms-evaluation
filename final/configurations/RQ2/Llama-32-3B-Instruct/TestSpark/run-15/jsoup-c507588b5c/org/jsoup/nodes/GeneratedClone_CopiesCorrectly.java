package org.jsoup.nodes;

public class GeneratedClone_CopiesCorrectly {

    @Test
    public void clone_CopiesCorrectly() {
        // Arrange
        TextNode original = new TextNode("test");
        TextNode clone = (TextNode) original.clone();

        // Act & Assert
        assertEquals(original, clone);
        assertTrue(clone.text().equals(original.text()));
    }

}