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
public class GeneratedOuterHtmlTail {

    @RunWith(MockitoJUnitRunner.class)
    public class TextNodeTest {

        private static final String text = "Hello World!";
        private static final int offset = 5;
        private static final String encodedText = "%3Chello%20World%21%3E";

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

    }