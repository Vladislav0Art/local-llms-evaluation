package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newNode_textIsBlankTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void newNode_textIsEmptyTest() {
        TextNode node = new TextNode(" ");
        assertFalse(node.isBlank());
    }

    @Test
    public void newNode_textIsNotEmptyTest() {
        TextNode node = new TextNode("test");
        assertFalse(node.isBlank());
    }

    @Test
    public void clone_methodTests() {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode clone = node.clone();
        assertEquals(text, clone.text());
    }

    @Test
    public void splitText_emptyOffsetTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode result = node.splitText(0);
        assertNotNull(result);
        assertTrue(result.text().isEmpty());
    }

    @Test
    public void splitText_offsetAtEndTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode result = node.splitText(text.length());
        assertNotNull(result);
        assertTrue(result.text().isEmpty());
    }

    @Test
    public void createFromEncoded_encodedEmptyTest() {
        String encoded = "";
        TextNode node = TextNode.createFromEncoded(encoded);
        assertNotNull(node);
    }

    @Test
    public void createFromEncoded_encodedNotEmptyTest() {
        String encoded = "test";
        TextNode node = TextNode.createFromEncoded(encoded);
        assertNotNull(node);
        assertEquals("test", node.text());
    }
}

@Test
public void outerHtmlHead_appendsNodeToStreamTest() throws IOException {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outContent));
    TextNode node = new TextNode("test");
    Document document = new Document.Builder().append(node).build();
    document.outerHtmlHead(System.out, 0, new Document.OutputSettings());
    assertEquals("test", outContent.toString());
    originalOut.flush();
    originalOut.close();
}

@Test
public void outerHtmlTail_appendsNodeToStreamTest() throws IOException {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outContent));
    TextNode node = new TextNode("test");
    Document document = new Document.Builder().append(node).build();
    document.outerHtmlTail(System.out, 0, new Document.OutputSettings());
    assertEquals("test", outContent.toString());
    originalOut.flush();
    originalOut.close();
}

@Test
public void toString_methodTests() {
    String text = "test";
    TextNode node = new TextNode(text);
    assertEquals(text, node.toString());
}

}