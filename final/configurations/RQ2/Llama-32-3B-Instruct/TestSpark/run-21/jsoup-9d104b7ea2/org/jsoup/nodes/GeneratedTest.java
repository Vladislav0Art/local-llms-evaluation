package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.output.OutputSettings;
import org.jsoup.output.UTF8StreamRenderer;

public class GeneratedTest {

    public String trim(String str) {
        return str.trim();
    }

    @Test
    public void nodeName_Test() {
        TextNode node = new TextNode("test");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void text_Test() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

    @Test
    public void text_Set_Test() {
        TextNode node = new TextNode("");
        node.text("test");
        assertEquals("test", node.text());
    }

    @Test
    public void getWholeText_Test() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.getWholeText());
    }

    @Test
    public void isBlank_Test() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
        assertFalse(new TextNode("test").isBlank());
    }

    @Test
    public void clone_Test() {
        TextNode node = new TextNode("test");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
    }

    @Test
    public void createFromEncoded_Test() {
        String encodedText = "UTF-8\\u202f";
        assertEquals(encodedText, TextNode.createFromEncoded(encodedText));
    }

    @Test
    public void normaliseWhitespace_Test() {
        assertEquals("  ", trim("   "));
        assertEquals("", trim(""));
    }

    @Test
    public void stripLeadingWhitespace_Test() {
        assertEquals("", trim("   "));
        assertEquals("hello", trim("hello"));
    }

    @Test
    public void lastCharIsWhitespace_Test() {
        assertFalse(lastCharIsWhitespace(' '));
        assertTrue(lastCharIsWhitespace('\n'));
    }

    private boolean lastCharIsWhitespace(char c) {
        return Character.isWhitespace(c);
    }

}