package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void testBlankText() {
        TextNode text = new TextNode("");
        assertTrue(text.isBlank());
    }

    @Test
    public void testIsBlank() {
        TextNode text = new TextNode("   Hello World!   ");
        assertTrue(text.isBlank());

        text = new TextNode();
        assertTrue(text.isBlank());

        text = new TextNode("\n");
        assertTrue(text.isBlank());
    }

    @Test
    public void testSplitText() throws IOException {
        TextNode text = new TextNode("<a href='#'>Hello</a>");
        TextNode result = text.splitText(0);
        assertNotNull(result);

        assertTrue(result.text().isEmpty());

        TextNode tempText = new TextNode("   Hello World!   ");
        TextNode result2 = text.splitText(0);
        assertEquals(tempText, result2);
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = newDocument();
        TextNode text = new TextNode("<a href='#'>Hello</a>");
        Appendable output = document.outerHtml();

        outerHtmlHead(output, 0, document);

        assertEquals("Hello", output.toString());

        TextNode text2 = new TextNode("");
        append(output, text2);

        assertTrue(text2.isBlank());
    }

    @Test
    public void testToString() {
        TextNode text = new TextNode("<a href='#'>Hello</a>");
        assertEquals("<a href='#'>Hello</a>", text.toString());

        TextNode text2 = new TextNode("   Hello World!   ");
        assertEquals("   Hello World!   ", text2.toString());
    }

    @Test
    public void testClone() {
        TextNode text = new TextNode("");
        TextNode clone = (TextNode) text.clone();

        assertNotNull(clone);

        String originalText = text.text();
        String clonedText = clone.text();

        assertEquals(originalText, clonedText);
    }

    public Document newDocument() throws IOException {
        return newDocumentBuilder().build();
    }

    private Document documentBuilder() throws IOException {
        return new JsoupDocumentBuilder("Test HTML Document")
                .setRootElement("#root");
    }

}