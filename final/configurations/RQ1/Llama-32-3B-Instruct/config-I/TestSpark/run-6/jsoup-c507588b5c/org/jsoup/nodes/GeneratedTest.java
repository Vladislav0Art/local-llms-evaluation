package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void createTextNode_TextIsNotBlank_ThenReturnText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void createTextNode_TextIsEmpty_ThenReturnEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

    @Test
    public void createTextNode

    BlankSpaceOnly_ThenReturnBlankSpaces() {
        TextNode textNode = new TextNode("   ");
        assertEquals("   ", textNode.text());
    }

    @Test
    public void splitText_NoOffset_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(0);
        assertEquals(textNode, result);
    }

    @Test
    public void splitText_NegativeOffset_ThrowsInvalidArgumentException() {
        try {
            TextNode textNode = new TextNode("Hello World");
            textNode.splitText(-1);
            fail();
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void splitText_SameOffset_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(textNode.text().length());
        assertEquals(textNode, result);
    }

    @Test
    public void isBlank_TextIsBlank_ThenReturnTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_TextIsEmptyButNotBlank_ThenReturnFalse() {
        TextNode textNode = new TextNode(" ");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void cloneTextNode_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode, clonedTextNode);
    }
}

@Test
public void createTextFromEncoded_NoOutput_ThenReturnTextNodeWithCorrectValue() {
    TextNode result = TextNode.createFromEncoded("&lt;Hello World&gt;");
    assertNotNull(result);
    assertEquals("Hello World", result.text());
}

@Test
public void stripLeadingWhitespace_NoInput_ThenReturnsEmptyString() {
    assertEquals("", StringUtil.stripLeadingWhitespace(""));
}

@Test
public void stripLeadingWhitespace_HasLeadingWhitespace_ThenStripItAway() {
    assertEquals("World", StringUtil.stripLeadingWhitespace("   World"));
}

@Test
public void stripLeadingWhitespace_HasMultipleLeadingWhitespacees_ThenRemoveThemAll() {
    assertEquals("Hello  World", StringUtil.stripLeadingWhitespace("   Hello World "));
}
	}

@Test
public void normaliseWhitespace_NoInput_ThenReturnOriginalString() {
    String result = StringUtil.normaliseWhitespace("");
    assertEquals("", result);
}

@Test
public void normaliseWhitespace_HasSingleLeadingWhitespace_ThenReturnWithoutIt() {
    String result = StringUtil.normaliseWhitespace(" ");
    assertEquals(" ", result);
}

@Test
public void normaliseWhitespace_HasMultipleLeadingWhitespacees_ThenRemoveAll() {
    String result = StringUtil.normaliseWhitespace("   ");
    assertEquals(" ", result);
}

}