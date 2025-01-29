package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.NodeResult;

public class GeneratedOuterHtmlHead_test {

    @Test
    public void outerHtmlHead_test() {
        // Arrange
        String text = "";
        Document document = new Document();
        Appendable accum = document.appendNode(new TextNode(text));

        // Act
        String result = getOuterHtmlHead(accum);

        // Assert
        assertEquals("<html><head></head>", result);
    }

}