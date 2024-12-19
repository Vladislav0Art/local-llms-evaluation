package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void blank_node() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void split_text() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode tailNode = node.splitText(10);
        assertNotNull(tailNode);
        assertEquals("Hello", tailNode.text());
    }

    @Test
    public void inner_html_head() throws IOException {
        Document document = new Document();
        Appendable accum = document.createOuterHtmlHead(null, 0, Document.OutputSettings.PrettyPrint(), false, true, true, true);

        TextNode node = new TextNode("");
        node.outerHtmlHead(accum, 0, null);
        String result = StringUtil.normaliseWhitespace(node.text());
        assertEquals("<>text", result);
    }

    @Test
    public void toString() {
        TextNode node = new TextNode("");
        String expected = "<text></text>";
        String actual = node.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void clone() {
        TextNode node = new TextNode("Hello World");
        TextNode clonedNode = (TextNode) node.clone();
        assertNotNull(clonedNode);
        assertEquals(node, clonedNode);
    }

}