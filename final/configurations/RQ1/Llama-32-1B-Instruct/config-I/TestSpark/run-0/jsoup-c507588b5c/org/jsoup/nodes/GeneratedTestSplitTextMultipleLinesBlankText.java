package org.jsoup.nodes;

public class GeneratedTestSplitTextMultipleLinesBlankText {

    @Test
    public void testSplitTextMultipleLinesBlankText() {
        // Arrange
        String text = "Hello\n";

        // Act
        TextNode result = TextNode.splitText(4);
        assertThat(result.text(), is("Hello"));
    }

}