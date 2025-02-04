package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newTextNode_GivenText_ReturnsNewTextNode() {
        String text = "test";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
    }

    @Test
    public void nodeNameReturns_SpecialTextNodeName() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_GivenText_ReturnsTextContent() throws IOException {
        String text = "test";
        TextNode textNode = new TextNode(text);
        assertEquals("test", textNode.text());
    }

    @Test
    public void text_GivenBlankString_ReturnsBlankString() {
        String blankText = "";
        TextNode textNode = new TextNode(blankText);
        assertEquals("", textNode.text());
    }

    @Test
    public void splitText_GivenOffset_ReturnsNewTextNodeWithSplittingCharacteristics() throws IOException {
        String text = "test";
        int offset = 3;
        TextNode textNode = new TextNode(text);
        TextNode splitTextNode = textNode.splitText(offset);
        assertNotNull(splitTextNode);
    }

    @Test
    public void isBlank_GivenBlankString_ReturnsTrue() {
        String blankText = "";
        assertTrue(new TextNode(blankText).isBlank());
    }

    @Test
    public void isBlank_GivenNonBlankString_ReturnsFalse() {
        String nonBlankText = "test";
        assertFalse(new TextNode(nonBlankText).isBlank());
    }
}

@Test
public void newTextNode_BuiltCorrectly() throws IOException {
    String text = "test";
    TextNode textNode = TextNode.newBuilder()
            .text(text)
            .build();
    assertEquals(text, textNode.text());
}

@Test
public void text_GivenBlankString_BuiltCorrectly() throws IOException {
    String blankText = "";
    TextNode textNode = TextNode.newBuilder()
            .text(blankText)
            .build();
    assertEquals("", textNode.text());
}
	}

@Test
public void createFromEncoded_GivenEncodedString_ReturnsTextNodeWithUnescapedData() {
    String encodedText = "&lt;test&gt;";
    TextNode textNode = TextNode.createFromEncoded(encodedText);
    assertNotNull(textNode);
    assertEquals("test", textNode.text());
}

}