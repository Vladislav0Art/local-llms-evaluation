package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlTail_SetsCorrectHtml {

    @Test
    public void outerHtmlTail_SetsCorrectHtml() {
        // Arrange

        // Act and Assert
        Document document = new Document();
        TextNode textNode = new TextNode("");

        Appendable appendable = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(false, false);
        textNode.outerHtmlTail(appendable, depth, out);

        assertEquals("", appendable.toString());
    }

}