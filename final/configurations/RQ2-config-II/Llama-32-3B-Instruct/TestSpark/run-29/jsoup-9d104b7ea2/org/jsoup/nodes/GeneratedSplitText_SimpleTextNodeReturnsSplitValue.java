package org.jsoup.nodes;

public class GeneratedSplitText_SimpleTextNodeReturnsSplitValue {

    @Test
    public void splitText_SimpleTextNodeReturnsSplitValue() throws IOException {
        // Arrange
        TextNode node = new TextNode("hello world");
        int offset = 6;

        // Act
        String actual = node.splitText(offset);

        // Assert
        assertEquals("world", actual);
    }

}