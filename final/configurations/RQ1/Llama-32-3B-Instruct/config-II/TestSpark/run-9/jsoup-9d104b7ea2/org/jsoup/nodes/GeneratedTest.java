package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTest {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void [
    TextNode creation][withText]

    Test() {
        assertNotNull(textNode);
    }

    @Test
    public void [
    TextNode text][emptyString]

    Test() {
        assertEquals("", textNode.text());
    }

    @Test
    public void [
    TextNode text][withWhitespace]

    Test() {
        textNode = new TextNode("Hello World ");
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void [
    TextNode splitText][splitAtEnd]

    Test() {
        final String originalText = "Hello World";
        int offset = originalText.length();
        TextNode result = textNode.splitText(offset);
        assertEquals(originalText, result.getWholeText());
    }

    @Test
    public void [
    TextNode splitText][splitInMiddle]

    Test() {
        final String originalText = "Hello World";
        int offset = 5;
        TextNode result = textNode.splitText(offset);
        assertEquals("World", result.getWholeText());
    }

    @Test
    public void [
    TextNode isBlank][emptyString]

    Test() {
        assertTrue(textNode.isBlank());
    }

    @Test
    public void [
    TextNode isBlank][withWhitespace]

    Test() {
        textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void [
    TextNode splitText][negativeOffset]

    Test() {
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(-1));
    }

    @Test
    public void [
    TextNode splitText][offsetGreaterThenTextLength]

    Test() {
        final String originalText = "Hello World";
        int offset = 10;
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(offset));
    }
}

@Test
public void [
LeafNode clone][withChildren]

Test() {
    TextNode leafNode = new TextNode("Hello World");
    document.appendChild(leafNode);
    TextNode clonedNode = leafNode.clone();
    assertNotNull(clonedNode.getWholeText());
}

@Test
public void [
LeafNode clone][withoutChildren]

Test() {
    TextNode leafNode = new TextNode("");
    document.appendChild(leafNode);
    TextNode clonedNode = leafNode.clone();
    assertNotNull(clonedNode.getWholeText());
}
	}

@Test
public void [
Document appendChild][withTextNode]

Test() {
    TextNode textNode = new TextNode("Hello World");
    document.appendChild(textNode);
    assertEquals(1, textNode.getSiblingIndex());
}

@Test
public void [
Document appendChild][withoutTextNode]

Test() {
    assertThrows(IllegalArgumentException.class, () -> document.appendChild(null));
}
	}

@Test
public void [
StringUtil normaliseWhitespace][withEmptyString]

Test() {
    assertEquals("", StringUtil.normaliseWhitespace(""));
}

@Test
public void [
StringUtil normaliseWhitespace][withText]

Test() {
    assertEquals(testString, StringUtil.normaliseWhitespace(testString));
}
	}

@Test
public void [
Entities unescape][encodedText]

Test() {
    assertEquals("Hello World", Entities.unescape(testEncodedText));
}

@Test
public void [
Entities escape][unescapedString]

Test() {
    String unescapedString = "Hello World";
    StringBuilder escapedStringBuilder = new StringBuilder();
    Entities.escape(escapedStringBuilder, unescapedString, null, false, false, true, true);
    assertEquals(testEncodedText, escapedStringBuilder.toString());
}

}