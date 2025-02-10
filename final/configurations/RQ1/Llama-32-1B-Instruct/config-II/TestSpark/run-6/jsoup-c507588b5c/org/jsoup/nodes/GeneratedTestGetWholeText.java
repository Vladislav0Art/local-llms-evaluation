package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.helper.Validate;

public class GeneratedTestGetWholeText {

    private static Document document = new Document();

    @Test
    public void testGetWholeText() {
        // Test get the (unencoded) text of this text node, including any newlines and spaces present in the original.
        assertEquals("", document.text());
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello\nWorld", textNode.getText());
    }

}