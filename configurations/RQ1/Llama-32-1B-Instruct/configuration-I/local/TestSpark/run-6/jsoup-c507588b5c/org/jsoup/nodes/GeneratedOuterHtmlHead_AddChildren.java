package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_AddChildren {

    @Test
    public void outerHtmlHead_AddChildren() {
        // Arrange
        Document doc = new Document();
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        TextNode textNode = new TextNode("hello");
        append(root, 0, accum, out);

        // Assert
        assertTrue(accum.length() > 1);
    }

    private void append(Appendable accum, int depth, Appendable parent, Document.OutputSettings settings) {
        String nodeText = toString();

        if (nodeText.isEmpty()) {
            return;
        }

        if (!settings.isAppendString(nodeText)) {
            String leadingSpaces = new StringBuilder().append("  ").toString();
            String trailingSpaces = new StringBuilder().reverse().toString() + "\n";

            accum.append(leadingSpaces).append(trailingSpaces);
        } else {
            accum.append(nodeText);
        }

        append(root, depth, parent, settings);
    }

}