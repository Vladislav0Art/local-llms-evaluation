package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

public class GeneratedTest {

    private TextNode node;

    @Before
    public void setup() {
        Random random = new Random();
        node = new TextNode(StringUtil.randomString(10, 100));
    }

    @Test
    public void testIsBlank() {
        assertTrue(node.isBlank());
    }

    @Test
    public void testGetWholeText() {
        String text = "   Hello World!";
        assertEquals("   Hello World!", node.getText());
    }

    @Test
    public void testSplitText() {
        int offset = 10;
        TextNode result = node.splitText(offset);
        assertNotNull(result);
        assertTrue(result.isBlank());
        assertEquals(5, result.getWholeText().length());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        String text = "   Hello World!";
        node.setText(text);
        Document document = createDocument();
        Appendable appender = new StringBuilder();
        document.outerHtml(appender, 1, null);
        assertEquals("Hello World!", appender.toString());
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        String text = "   Hello World!";
        node.setText(text);
        Document document = createDocument();
        Appendable appender = new StringBuilder();
        document.outerHtml(appender, 1, null);
        assertEquals("Hello World!", appender.toString());
    }

    @Test
    public void testClone() {
        TextNode clone = node.clone();
        assertNotNull(clone);
        assertTrue(node.isBlank());
    }

    @Test
    public void testToString() {
        String text = "   Hello World!";
        node.setText(text);
        assertEquals("Hello World!", node.toString());
    }

    private Document createDocument() throws IOException {
        return new Document();
    }

}