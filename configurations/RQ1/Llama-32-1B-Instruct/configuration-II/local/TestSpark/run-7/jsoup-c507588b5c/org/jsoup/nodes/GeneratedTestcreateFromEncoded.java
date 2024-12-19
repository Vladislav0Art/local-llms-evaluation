package org.jsoup.nodes;

public class GeneratedTestcreateFromEncoded {

    @Test
    public void testcreateFromEncoded() {
        // Arrange
        String encodedText = "&amp;lt;Hello World!&gt;";
        TextNode rootNode = new TextNode(createFromEncoded(encodedText));

        // Act
        StringBuilder sb = new StringBuilder();
        node.stripLeadingWhitespace(sb);
        assertEquals("   ", sb.toString());
    }

}