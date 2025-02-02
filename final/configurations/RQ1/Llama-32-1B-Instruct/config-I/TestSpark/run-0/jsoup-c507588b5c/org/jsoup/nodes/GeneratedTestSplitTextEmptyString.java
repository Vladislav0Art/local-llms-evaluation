package org.jsoup.nodes;

public class GeneratedTestSplitTextEmptyString {

    @Test
    public void testSplitTextEmptyString() {
        // Arrange
        String text = "   ";

        // Act
        TextNode result = TextNode.splitText(5);
        assertThat(result.text(), is("   "));
    }

}