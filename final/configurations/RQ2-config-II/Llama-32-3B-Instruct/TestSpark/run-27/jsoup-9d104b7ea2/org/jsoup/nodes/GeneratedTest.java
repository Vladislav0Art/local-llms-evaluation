package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Text;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @RunWith(MockitoJUnitRunner.class)
    public class TextNodeTest {

        private static final String text = "Hello World!";
        private static final int offset = 5;
        private static final String encodedText = "%3Chello%20World%21%3E";

        @Test
        public void newNode() {
            assertNotNull(new TextNode(text));
        }

        @Test
        public void nodeName() {
            TextNode textNode = new TextNode(text);
            assertEquals("text", textNode.nodeName());
        }

        @Test
        public void text() {
            TextNode textNode = new TextNode(text);
            assertEquals(text, textNode.text());
        }

        @Test
        public void newText() {
            TextNode newText = new TextNode(encodedText);
            assertNotNull(newText);
        }

        @Test
        public void getWholeText() {
            TextNode textNode = new TextNode(text);
            assertEquals(text, textNode.getWholeText());
        }

        @Test
        public void isBlank() {
            TextNode textNode = new TextNode("");
            assertTrue(textNode.isBlank());
        }

        @Test
        public void splitText() {
            TextNode textNode = new TextNode(text);
            Node result = textNode.splitText(offset);
            assertNotNull(result);
        }

        @Test
        public void outerHtmlHead() throws IOException, ParserConfigurationException, TransformerException {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outContent));
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new DOMSource("<html><body>" + text + "</body></html>"));
            TextNode textNode = (TextNode) document.body(0).children().get(0);
            textNode.outerHtmlHead(new Appendable() {
                @Override
                public void append(CharSequence cs, int start, int end) throws IOException {
                }
            }, 1, new Document.OutputSettings());
            System.setOut(originalOut);
            assertEquals("<p>Hello Worl<code>d!</code></p>", outContent.toString().trim());
        }

        @Test
        public void outerHtmlTail() throws IOException {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outContent));
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new DOMSource("<html><body>" + text + "</body></html>"));
            TextNode textNode = (TextNode) document.body(0).children().get(0);
            textNode.outerHtmlTail(new Appendable() {
                @Override
                public void append(CharSequence cs, int start, int end) throws IOException {
                }
            }, 1, new Document.OutputSettings());
            System.setOut(originalOut);
            assertEquals("", outContent.toString().trim());
        }

        @Test
        public void toString() {
            TextNode textNode = new TextNode(text);
            assertNotNull(textNode.toString());
        }

        @Test
        public void clone() {
            TextNode textNode = new TextNode(text);
            Node clonedTextNode = textNode.clone();
            assertEquals(1, clonedTextNode.children().size());
        }

        @Test
        public void createFromEncoded() {
            TextNode textNode = TextNode.createFromEncoded(encodedText);
            assertNotNull(textNode);
        }

        @Test
        public void normaliseWhitespace() {
            String result = TextNode.normaliseWhitespace("   ");
            assertEquals("&nbsp;&nbsp;", result);
        }

        @Test
        public void stripLeadingWhitespace() {
            String result = TextNode.stripLeadingWhitespace("   Hello World!");
            assertEquals("Hello World!", result);
        }

        @Test
        public void lastCharIsWhitespace() {
            assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder()));
            assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder("a")));
        }
    }

    private static class Document extends LeafNode {

        public Element body() {
            return new Element("body");
        }

        public Node children() {
            throw new UnsupportedOperationException();
        }

        @Override
        public String nodeName() {
            return "html";
        }

        @Override
        public String text() {
            return "";
        }
    }

    private static class Element extends LeafNode {

        public Element(String name) {
            super(name);
        }

        public Node children() {
            throw new UnsupportedOperationException();
        }

        @Override
        public String nodeName() {
            return "body";
        }

        @Override
        public String text() {
            return "";
        }
    }

}