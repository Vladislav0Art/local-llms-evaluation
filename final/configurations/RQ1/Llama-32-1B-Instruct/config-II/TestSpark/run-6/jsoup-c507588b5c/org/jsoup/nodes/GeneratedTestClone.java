package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.helper.Validate;

public class GeneratedTestClone {

    private static Document document = new Document();

    @Test
    public void testClone() {
        // Test that the clone method creates a new TextNode from HTML encoded (aka escaped) data.
        String encodedText = "&amp;lt;p&gt;Hello &amp; World!&amp;lt;/p&gt;";
        TextNode textNode = new TextNode(encodedText);
        assertEquals(textNode, textNode.clone());
    }

}