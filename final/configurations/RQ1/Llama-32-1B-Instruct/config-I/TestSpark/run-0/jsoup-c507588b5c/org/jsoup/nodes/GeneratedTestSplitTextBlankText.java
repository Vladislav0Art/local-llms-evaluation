package org.jsoup.nodes;

public class GeneratedTestSplitTextBlankText {

    @Test
    public void testSplitTextBlankText() {
        // Arrange
        String text = "";

        // Act
        TextNode result = TextNode.splitText(0);
        assertThat(result.text(), is(""));
    }

}