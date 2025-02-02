package org.jsoup.nodes;

public class GeneratedTestSplitTextMultipleLines {

    @Test
    public void testSplitTextMultipleLines() {
        // Arrange
        String text = "Hello\nWorld";

        // Act
        TextNode result = TextNode.splitText(7);
        assertThat(result.text(), is("Hello World"));
    }

}