package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void nodeName() {
        String nodeName = new TextNode("text").nodeName();
        assertEquals("text", nodeName);
    }

    @Test
    public void text() {
        TextNode textNode = new TextNode("");
        String text = textNode.text();
        assertNull(text);
    }

    @Test
    public void textString() {
        TextNode textNode = new TextNode("Hello");
        String text = textNode.text();
        assertEquals("Hello", text);
    }

    @Test
    public void textText() {
        TextNode textNode = new TextNode("");
        String text = textNode.text("Hello");
        assertEquals("Hello", text);
    }

    @Test
    public void getWholeText() {
        TextNode textNode = new TextNode("Hello World");
        String wholeText = textNode.getWholeText();
        assertEquals("Hello World", wholeText);
    }

    @Test
    public void isBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
        assertFalse(new TextNode("Hello").isBlank());
    }

    @Test
    public void splitTextOffset() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        String[] strings = textNode.splitText(6).splitText(-1).splitText(-1);
        assertEquals(Arrays.asList("Hello", originalText.substring(7)), strings[0].splitText(-1));
    }

    @Test
    public void clone() {
        TextNode cloned = new TextNode("text").clone();
        assertNotNull(cloned);
        assertEquals(new TextNode("text"), cloned);
    }

    @Test
    public void createFromEncoded() throws IOException {
        String encoded = "UTF-8%3A%22Hello%22";
        TextNode textNode = TextNode.createFromEncoded(encoded);
        assertEquals(new TextNode("Hello"), textNode);
    }
}

class StubAppendable implements Appendable {
    private StringBuilder sb;

    public StubAppendable(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public Writer getAppendable() throws IOException {
        return new StringWriter();
    }

    @Override
    public void append(char c) throws IOException {
    }

    @Override
    public void append(CharSequence csq) throws IOException {
    }

    @Override
    public void append(CharSequence csq, int start, int end) throws IOException {
    }
}

class StubDocumentOutputSettings implements Document.OutputSettings {
    private boolean outputEnabled;

    public StubDocumentOutputSettings(boolean outputEnabled) {
        this.outputEnabled = outputEnabled;
    }

    @Override
    public boolean isOutputEnabled() {
        return outputEnabled;
    }

}