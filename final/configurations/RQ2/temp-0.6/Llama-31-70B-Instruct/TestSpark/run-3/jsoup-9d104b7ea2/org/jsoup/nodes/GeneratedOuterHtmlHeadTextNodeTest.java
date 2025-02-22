package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedOuterHtmlHeadTextNodeTest {

    @Test
    public void outerHtmlHeadTextNodeTest() {
        TextNode textNode = new TextNode("text");
        StringWriter writer = new StringWriter();
        try {
            textNode.outerHtmlHead(writer, 0, new Document.OutputSettings());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("text", writer.toString());
    }

}