package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void createTextNode_ValidText_ReturnsTextNode() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.value());
    }

    @Test
    public void nodeName_ValidText_ReturnsCorrectNodeName() {
        TextNode textNode = new TextNode("Test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_ValidText_ReturnsUnencodedText() throws IOException {
        String encodedText = "&lt;Test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("&lt;Test&gt;", textNode.text());
    }

    @Test
    public void text_BlankText_ReturnsBlankString() {
        String blankText = "   ";
        TextNode textNode = new TextNode(blankText);
        assertEquals(blankText, textNode.text());
    }

    @Test
    public void isBlank_ValidBlankText_ReturnsTrue() throws IOException {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_ValidNonBlankText_ReturnsFalse() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_ValidOffset_ReturnsCorrectTextNode() throws IOException {
        String encodedText = "&lt;Test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        TextNode result = textNode.splitText(3);
        assertEquals("World", result.text());
    }

    @Test
    public void splitText_InvalidOffset_ThrowsException() throws IOException {
        String encodedText = "&lt;Test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(-1));
    }
}

@Test
public void splitText_MockitoMocking_ReturnsCorrectTextNode() throws IOException {
    // Arrange and Act
    MockableParentNode parentNode = mock(MockableParentNode.class);
    TextNode textNode = new TextNode("Hello World");
    when(parentNode.addChildren()).thenReturn(1);
    String encodedText = "&lt;Test&gt;";
    TextNode result = textNode.splitText(3, parentNode);
    assertEquals("World", result.text());
}
	}

@Test
public void normaliseWhitespace_ValidText_ReturnsNormalisedString() {
    String text = "   Hello World  ";
    String expected = "Hello World";
    assertEquals(expected, StringUtil.normaliseWhitespace(text));
}

@Test
public void stripLeadingWhitespace_ValidText_ReturnsTrimmedString() {
    String text = "   Hello World  ";
    String expected = "Hello World";
    assertEquals(expected, StringUtil.stripLeadingWhitespace(text));
}
	}

@Test
public void unescapeEncodedText_ValidEncodedText_ReturnsUnescapedText() {
    String encodedText = "&lt;Test&gt;";
    String result = Entities.unescape(encodedText);
    assertEquals("&lt;Test&gt;", result);
}

}