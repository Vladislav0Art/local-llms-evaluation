package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTail {

    @Test
    public void outerHtmlTail() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // mocking parentNode and appendChildren
        TextNode node = new TextNode("");
        node.parentNode = mock(Document.class);
        when(node.parentNode.addChildren()).thenReturn(document);

        node.outerHtmlTail(accum, 0, null);
    }

}