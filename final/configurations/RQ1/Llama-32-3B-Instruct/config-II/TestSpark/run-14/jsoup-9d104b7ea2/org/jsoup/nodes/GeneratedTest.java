package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedTest {

    @Test
    public void newTextNode_GivenEmptyText_ReturnsBlankTextNode() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.text().isEmpty());
    }

    @Test
    public void newTextNode_GivenNonEmptyText_ReturnsTextNodeWithNormalisedWhitespace() {
        String text = "   ";
        TextNode node = new TextNode(text);
        assertEquals(" ", node.text());
    }

    @Test
    public void createFromEncodedText_GivenEncodedText_ReturnsTextNodeWithUnescapedText() throws Exception {
        String encodedText = "&#60;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("<", node.text());
    }

    @Test
    public void text_GivenBlankText_ReturnsBlankText() {
        TextNode node = new TextNode("");
        assertTrue(node.text().isEmpty());
    }

    @Test
    public void text_GivenNonEmptyText_ReturnsNormalisedWhitespace() {
        String text = "   ";
        TextNode node = new TextNode(text);
        assertEquals(" ", node.text());
    }

    @Test
    public void splitText_GivenOffset

    GreaterThanLength_ReturnsSameTextNode() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 10;
        TextNode result = node.splitText(offset);
        assertEquals(node, result);
    }

    @Test
    public void splitText_GivenOffsetGreaterThanOrEqualLength_ReturnsTwoTextNodeWithSplitText() throws Exception {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 6;
        TextNode result = node.splitText(offset);
        assertEquals("Hello", result.text());
        assertEquals("World", node.text());
    }

    @Test
    public void isBlank_GivenBlankTextNode_ReturnsTrue() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlank_GivenNonEmptyTextNode_ReturnsFalse() {
        String text = "   ";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }
}

@Test
public void clone_GivesSameLeafNode() {
    String text = "Hello World";
    LeafNode node = new LeafNode(text);
    TextNode cloned = (TextNode) node.clone();
    assertEquals(text, cloned.text());
}

@Test
public void outerHtml_HandlesEmptyTextNodeProperly() throws Exception {
    TextNode node = new TextNode("");
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    Document.OutputSettings settings = new Document.OutputSettings(out);
    node.outerHtmlHead(settings, 0, null);
    String result = out.toString().trim();
    assertEquals("", result);
}
	}

@Test
public void normaliseWhitespace_GivesProperOutput() {
    String text = "   ";
    String expected = " ";
    String result = StringUtil.normaliseWhitespace(text);
    assertEquals(expected, result);
}

@Test
public void stripLeadingWhitespace_GivesProperOutput() {
    String text = "   Hello World";
    String expected = "Hello World";
    String result = StringUtil.stripLeadingWhitespace(text);
    assertEquals(expected, result);
}

@Test
public void lastCharIsWhitespace_GivesTrueWhenLastCharIsSpace() {
    StringBuilder sb = new StringBuilder("Hello ");
    assertTrue(StringUtil.lastCharIsWhitespace(sb));
}

}