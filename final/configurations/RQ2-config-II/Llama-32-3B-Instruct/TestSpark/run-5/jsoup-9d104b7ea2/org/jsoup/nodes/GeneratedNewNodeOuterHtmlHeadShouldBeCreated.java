package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNewNodeOuterHtmlHeadShouldBeCreated {

    @Test
    public void newNodeOuterHtmlHeadShouldBeCreated() {
        // Given
        Document document = new Document();
        TextNode textNode = new TextNode("<html>Hello, World!</html>");

        // When
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        String outerHtmlHead = textNode.outerHtmlHead(accum, depth, out);

        // Then
        Mockito.verify(out).setHtml(html("html"));
    }

}