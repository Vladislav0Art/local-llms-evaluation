package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlTailDoesNotThrowExceptionWhenAppendableIsAvailableAndDepthIsPositiveTest {

    @Test
    public void outerHtmlTailDoesNotThrowExceptionWhenAppendableIsAvailableAndDepthIsPositiveTest() {
        TextNode node = new TextNode("test");
        Appendable accum = null;
        Document.OutputSettings out = new Document.OutputSettings();
        assertEquals(out, node.outerHtmlTail(accum, 1, out));
    }

}