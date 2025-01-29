package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.TextNodeVisitor;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GeneratedNodeName {

    public static void main(String[] args) {
        TextNodeTest test = new TextNodeTest();
        test.testText();
        test.testIsBlank();
        test.testSplitText();
        test.testToString();
        test.testClone();
        test.testOuterHtmlHead();
        test.testOuterHtmlTail();
        test.testnodeName();
    }

    @Test
    public void nodeName() {
        Document document = new Document();
        Elements elements = document.getElementsByTag("text");
        for (String element : elements) {
            TextNodeVisitor visitor = new TextNodeVisitor();
            element.accept(visitor);
            assertEquals("text", visitor.getName());
        }
    }

    private void testText() {
        Document document = new Document();
        Elements elements = document.getElementsByTag("text");
        for (int i = 0; i < 10; i++) {
            TextNode node = (TextNode) elements.get(i).clone();
            assertEquals("Hello, World!", node.text());
        }
    }

    private void testIsBlank() {
        Document document = new Document();
        Elements elements = document.getElementsByTag("text");
        for (int i = 0; i < 10; i++) {
            TextNode node = (TextNode) elements.get(i).clone();
            assertEquals(true, node.text().trim().isEmpty());
        }
    }

    private void testSplitText() {
        Document document = new Document();
        Elements elements = document.getElementsByTag("text");
        for (int i = 0; i < 10; i++) {
            TextNode node1 = (TextNode) elements.get(i).clone();
            TextNode node2 = (TextNode) elements.get(9 + i).clone();
            assertEquals(node1, node2);
        }
    }

    private void testToString() {
        Document document = new Document();
        Elements elements = document.getElementsByTag("text");
        for (int i = 0; i < 10; i++) {
            TextNode node = (TextNode) elements.get(i).clone();
            assertEquals(new String(node.text()), new String(node.text()));
        }
    }

    private void testClone() {
        Document document = new Document();
        Elements elements = document.getElementsByTag("text");
        for (int i = 0; i < 10; i++) {
            TextNode node1 = (TextNode) elements.get(i).clone();
            TextNode node2 = (TextNode) elements.get(9 + i).clone();
            assertEquals(node1, node2);
        }
    }

    private void testOuterHtmlHead() {
        Document document = new Document();
        Elements elements = document.getElementsByTag("html");
        for (int i = 0; i < 10; i++) {
            TextNode head = (TextNode) elements.get(i).clone();
            assertEquals("<head>", head.text());
        }
    }

    private void testOuterHtmlTail() {
        Document document = new Document();
        Elements elements = document.getElementsByTag("html");
        for (int i = 0; i < 10; i++) {
            TextNode tail = (TextNode) elements.get(i).clone();
            assertEquals("", tail.text());
        }
    }

}