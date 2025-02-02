package org.jsoup.nodes;

public class GeneratedTestSplitTextSingleLineBlankText {

    @Test
    public void testSplitTextSingleLineBlankText() {
        // Arrange
        String text = "";

        // Act
        TextNode result = TextNode.splitText(0);
        assertThat(result.text(), is(""));
    }

}