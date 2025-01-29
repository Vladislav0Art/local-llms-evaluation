package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    @Test
    public void test

    nodeName() {
        String text = "Hello";
        assertEquals("text", TextNode.class.getMethod("nodeName").invoke(new TextNode(text)));
    }

    @Test
    public void test

    text() {
        String text = "Hello World!";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        for (Element element : elements) {
            assertEquals(text, element.text());
        }
    }

    @Test
    public void test

    getWholeText() {
        String text = "Hello World!";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        assertEquals(text, sb.toString());
    }

    @Test
    public void test

    isBlank() {
        String text = "Hello World!";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        assertEquals(true, TextNode.isBlank(sb.toString()));
    }

    @Test
    public void test

    splitText() {
        String text = "Hello World!";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        assertEquals(Arrays.asList("Hello", "World!"), TextNode.splitText(sb.toString()));
    }

    @Test
    public void test

    splitTextWithOneElement() {
        String text = "Hello World!";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        assertEquals(Arrays.asList("Hello", ""), TextNode.splitTextWithOneElement(sb.toString()));
    }

    @Test
    public void test

    outerHtmlHead() {
        String text = "Hello World!";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        assertEquals("", TextNode.outerHtmlHead(sb.toString()));
    }

    @Test
    public void test

    outerHtmlTail() {
        String text = "Hello World!";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        assertEquals("", TextNode.outerHtmlTail(sb.toString()));
    }

    @Test
    public void test

    Clone() {
        String text = "Hello World!";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        TextNode textNode = new TextNode(sb.toString());
        TextNode clonedTextNode = textNode.clone();
        assertEquals(text, textNode.getText());
        assertEquals(text, clonedTextNode.getText());
    }

    @Test
    public void test

    NormaliseWhitespace() {
        String text = "   Hello World!   ";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        assertEquals(text, TextNode.normaliseWhitespace(sb.toString()));
    }

    @Test
    public void test

    StripLeadingWhitespace() {
        String text = "   Hello World!   ";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        assertEquals(text, TextNode.stripLeadingWhitespace(sb.toString()));
    }

    @Test
    public void test

    LastCharIsWhitespace() {
        String text = "Hello World!";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        assertEquals(false, TextNode.lastCharIsWhitespace(sb.toString()));
    }

}