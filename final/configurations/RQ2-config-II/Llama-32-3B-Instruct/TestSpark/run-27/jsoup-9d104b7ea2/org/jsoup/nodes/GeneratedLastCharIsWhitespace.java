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
public class GeneratedLastCharIsWhitespace {

    @RunWith(MockitoJUnitRunner.class)
    public class TextNodeTest {

        private static final String text = "Hello World!";
        private static final int offset = 5;
        private static final String encodedText = "%3Chello%20World%21%3E";

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