package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedOuterHtmlTail_AppendingEditable_ShouldNotThrowException {

    @Test
    public void outerHtmlTail_AppendingEditable_ShouldNotThrowException() {
        TextNode textNode = new TextNode("TestNode");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        try {
            textNode.outerHtmlTail(accum, 0, out);
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
    }

}