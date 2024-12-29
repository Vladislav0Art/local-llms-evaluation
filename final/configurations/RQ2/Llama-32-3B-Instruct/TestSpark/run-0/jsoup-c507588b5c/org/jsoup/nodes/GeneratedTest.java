package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void nodeName() {
        when(Document.createElement("text")).thenReturn(new LeafNode());
        TextNode node = new TextNode("test");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void text() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.text());
    }

    @Test
    public void textNonNull() {
        when(Document.createElement("text")).thenReturn(new LeafNode());
        TextNode node = new TextNode(null);
        assertNotNull(node.text());
    }

    @Test
    public void textEmpty() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

    @Test
    public void getWholeText() {
        TextNode node = new TextNode("test");
        when(Document.createElement("text")).thenReturn(new LeafNode());
        String wholeText = node.getWholeText();
        assertEquals("test", wholeText);
    }

    @Test
    public void splitText() {
        TextNode node = new TextNode("test");
        assertEquals(0, node.splitText(0));
    }

    @Test
    public void isBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void clone() {
        TextNode node = new TextNode("test");
        when(Document.createElement("text")).thenReturn(new LeafNode());
        TextNode clone = node.clone();
        assertNotNull(clone);
    }

    @Test
    public void createFromEncoded() {
        String encodedText = "test";
        when(Document.createElement("text")).thenReturn(new LeafNode());
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, node.text());
    }

    @Test
    public void normaliseWhitespace() {
        String text = "   ";
        when(Document.createElement("text")).thenReturn(new LeafNode());
        assertEquals(" ", TextNode.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespace() {
        String text = "   test";
        when(Document.createElement("text")).thenReturn(new LeafNode());
        assertEquals("test", TextNode.stripLeadingWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder();
        Mockito.when(StringUtil.lastIndex(sb)).thenReturn(0);
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}