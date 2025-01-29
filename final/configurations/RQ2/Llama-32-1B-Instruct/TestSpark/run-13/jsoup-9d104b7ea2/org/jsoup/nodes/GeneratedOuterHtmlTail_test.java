package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.NodeResult;

public class GeneratedOuterHtmlTail_test {

    @Test
    public void outerHtmlTail_test() {
        // Arrange
        String text = "";
        Document document = new Document();
        Appendable accum = document.appendNode(new TextNode(text));
        int depth = 1;
        Document.OutputSettings out = Document.OutputSettings.INDENT_NONE;

        // Act
        String result = getOuterHtmlTail(accum, depth, out);

        // Assert
        assertEquals("<html><head></head>", result);
    }

}