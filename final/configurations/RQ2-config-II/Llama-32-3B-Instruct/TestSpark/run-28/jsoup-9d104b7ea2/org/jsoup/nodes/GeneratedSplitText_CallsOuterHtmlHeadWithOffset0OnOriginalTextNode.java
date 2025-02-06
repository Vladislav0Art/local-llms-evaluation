package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedSplitText_CallsOuterHtmlHeadWithOffset0OnOriginalTextNode {

    @Test
    public void splitText_CallsOuterHtmlHeadWithOffset0OnOriginalTextNode() throws IOException, InterruptedException, ExecutionException {
        Document mockDocument = mock(Document.class);
        Appendable mockAccum = mock(Appendable.class);

        TextNode textNode = new TextNode("example");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        when(mockDocument.outerHtmlHead(any(), eq(0), any())).thenAnswer(invocation -> {
            textNode.outerHtmlHead(outContent, 0, outputSettings);
            return null;
        });

        TextNode newTextNode = textNode.splitText(0);

        assertEquals(textNode, newTextNode);
    }

}