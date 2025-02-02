package org.jsoup.nodes;

public class GeneratedTestSplitTextSingleLine {

    @Test
    public void testSplitTextSingleLine() {
        // Arrange
        String text = "   ";

        // Act
        TextNode result = TextNode.splitText(0);
        assertThat(result.text(), is("   "));
    }

}