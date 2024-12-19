package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newTextNode_GivenText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        assert textNode != null;
    }

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectValue() {
        TextNode textNode = new TextNode("");
        assert textNode.nodeName().equals("#text");
    }

    @Test
    public void text_GivenTextNode_ReturnsUnencodedText() {
        TextNode textNode = new TextNode("Hello, World!");
        assert textNode.text().equals(StringUtil.normaliseWhitespace(textNode.getWholeText()));
    }

    @Test
    public void text_GivenBlankTextNode_ReturnsBlankValue() {
        TextNode textNode = new TextNode("");
        assert textNode.text().isEmpty();
    }

    @Test
    public void text_GivenTextNodeWithSpaces_ReturnsCorrectValue() {
        TextNode textNode = new TextNode("   ");
        assert textNode.text().equals(StringUtil.normaliseWhitespace(textNode.getWholeText()));
    }

    @Test
    public void isBlank_GivenTextNodeReturnsTrueIfBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_GivenTextNodeWithSpaces_ReturnsFalse() {
        TextNode textNode = new TextNode("   ");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_GivenTextNodeWithOffset_SplitsCorrectly() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode tailNode = textNode.splitText(6);
        assertEquals(5, tailNode.text().length());
    }

    @Test
    public void splitText_GivenBlankTextNode_SplitsCorrectly() {
        TextNode textNode = new TextNode("");
        TextNode tailNode = textNode.splitText(0);
        assertTrue(tailNode.isBlank());
    }
}

@Test
public void createFromEncoded_GivenEncodedText_ReturnsTextNode() {
    String encodedText = "&lt;Hello, World!&gt;";
    TextNode textNode = TextNode.createFromEncoded(encodedText);
    assert textNode != null;
}

@Test
public void createFromEncoded_GivenBlankEncodedText_ReturnsBlankValue() {
    String encodedText = "";
    TextNode textNode = TextNode.createFromEncoded(encodedText);
    assertTrue(textNode.isBlank());
}

}