package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedOuterHtmlHead_test {

    @Test
    public void outerHtmlHead_test() {
        // Arrange
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded("Hello World");
        node outerHtmlHead (new Appendable[]{}, 1, Document.OutputSettings.DEFAULT);

        // Assert
        verify(accum, never()).append("<html><head>Hello World</head></html>");
    }

}