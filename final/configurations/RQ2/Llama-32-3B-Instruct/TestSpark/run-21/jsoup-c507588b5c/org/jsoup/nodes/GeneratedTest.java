package org.jsoup.nodes;

import org.jsoup.helper.Validate;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    private String text;
    private int length;
    private Node node;

    public TextNode(String text) {
        this.text = text;
        this.length = text.length();
        this.node = null;
    }

    public String nodeName() {
        return "text";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String text() {
        return this.text;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int length() {
        return this.length;
    }
}

public class StringUtil {

    public static String normaliseWhitespace(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static String stripLeadingWhitespace(String text) {
        return text.trim().replaceAll("^\\s+", "");
    }
}

class Document {

    private ArrayList<Appendable> accumList;

    public void outerHtmlHead(ArrayList<Appendable> accumList, int depth, Document.OutputSettings out) throws IOException {
    }

    public void outerHtmlTail(ArrayList<Appendable> accumList, int depth, Document.OutputSettings out) throws IOException {
    }

    public static class OutputSettings {

    }
}

class Appendable implements java.io.Appendable {

}

class Node {

}

public class GeneratedTest {

    @Test
    public void nodeName() {
        TextNode node = new TextNode("example");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void text() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

    @Test
    public void clone() {
        TextNode node = new TextNode("example");
        Object cloned = node.clone();
        assertTrue(cloned instanceof TextNode);
        TextNode clonedNode = (TextNode) cloned;
        assertNotNull(clonedNode);
        assertEquals(node, clonedNode);
    }

    @Test
    public void createFromEncoded() {
        TextNode node = TextNode.createFromEncoded("example");
        assertEquals("example", node.text());
    }

    @Test
    public void normaliseWhitespace() {
        String text = "   example  ";
        String result = StringUtil.normaliseWhitespace(text);
        assertEquals("example", result);
    }

    @Test
    public void stripLeadingWhitespace() {
        String text = "   example  ";
        String result = StringUtil.stripLeadingWhitespace(text);
        assertEquals("example", result);
    }

    @Test
    public void splitText() {
        TextNode node = new TextNode("Hello World!");
        TextNode firstPart = (TextNode) node.splitText(0);
        String expectedFirstPart = "Hello ";
        assertEquals(expectedFirstPart, firstPart.text());

        TextNode secondPart = (TextNode) node.splitText(firstPart.text().length());
        String expectedSecondPart = "World!";
        assertEquals(expectedSecondPart, secondPart.text());
    }

    @Test
    public void outerHtmlHead() {
        Document document = new Document();
        ArrayList<Appendable> accumList = new ArrayList<>();
        document.outerHtmlHead(accumList, 0, null);
        assert !accumList.isEmpty();
    }

    @Test
    public void outerHtmlTail() {
        Document document = new Document();
        ArrayList<Appendable> accumList = new ArrayList<>();
        document.outerHtmlTail(accumList, 0, null);
        assert !accumList.isEmpty();
    }

}