package org.jsoup.nodes;

public class GeneratedTestSplitText_SplittingBetweenTags {

    @Test
    public void testSplitText_SplittingBetweenTags() {
        // Arrange
        String text = "<p>hello</p><span>world</span>";

        // Act
        TextNode result = TextNode.splitText(10);

        // Assert
        assertTrue(result.value().trim().isEmpty(), "Expected splitText(10) to return an empty string");
    }

}