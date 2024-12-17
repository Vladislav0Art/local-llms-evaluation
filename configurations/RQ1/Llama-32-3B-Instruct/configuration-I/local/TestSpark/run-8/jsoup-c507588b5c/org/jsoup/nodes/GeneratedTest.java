package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    public static class DocumentHelper {
        @Mock
        private LeafNode parentNode;

        @Mock
        private Appendable appendable;

        @Mock
        private int depth;

        @Mock
        private String siblingIndex();

        @Mock
        private Node sibling();

        @Mock
        private String text() throws Exception;

        public void addChildren(int index, Object child) {
            // mock implementation
        }

        public Appendable outerHtmlHead(Appendable appendable, int depth, Document document) {
            // mock implementation
            return null;
        }

        public String toString() {
            // mock implementation
            return "";
        }

        public Object clone() {
            // mock implementation
            return null;
        }
    }

    @RunWith(MockitoJUnitRunner.class)
    public class TextNodeTest {

        private DocumentHelper documentHelper;

        @BeforeEach
        public void setup() {
            documentHelper = new DocumentHelper();
        }

        @Test
        public void createTextNode_GivenText_ReturnsTextNode() {
            String text = "Hello World";
            TextNode textNode = new TextNode(text);
            assertNotNull(textNode);
        }

        @Test
        public void createTextNode_GivenEncodedText_ReturnsTextNode() {
            String encodedText = "&lt;Hello World&gt;";
            TextNode textNode = TextNode.createFromEncoded(encodedText);
            assertNotNull(textNode);
        }

        @Test
        public void nodeName_GivenTextNode_ReturnsCorrectString() {
            TextNode textNode = new TextNode("Hello World");
            assertEquals("#text", textNode.nodeName());
        }

        @Test
        public void text_GivenTextNode_ReturnsUnencodedText() {
            TextNode textNode = new TextNode("Hello World");
            assertEquals("Hello World", textNode.text());
        }

        @Test
        public void text_GivenEncodedTextNode_ReturnsDecodedText() {
            String encodedText = "&lt;Hello World&gt;";
            TextNode textNode = TextNode.createFromEncoded(encodedText);
            assertEquals("Hello World", textNode.text());
        }

        @Test
        public void isBlank_GivenBlankTextNode_ReturnsTrue() {
            TextNode textNode = new TextNode("");
            assertTrue(textNode.isBlank());
        }

        @Test
        public void isBlank_GivenNonBlankTextNode_ReturnsFalse() {
            TextNode textNode = new TextNode("Hello World");
            assertFalse(textNode.isBlank());
        }

        @Test
        public void splitText_GivenTextNodeWithOffset_SplitsCorrectly() {
            int offset = 5;
            String expectedHead = "Hello";
            String expectedTail = "World";
            when(documentHelper.parentNode.addChildren(siblingIndex(), new TextNode(expectedTail))).thenReturn(null);
            TextNode textNode = new TextNode("Hello World");
            TextNode result = textNode.splitText(offset);
            assertEquals(expectedHead, result.text());
        }

        @Test
        public void outerHtml_GivenTextNode_SplitsCorrectly() {
            Document document = documentHelper;
            Appendable appendable = new StringBuilder();
            int depth = 1;
            String expectedOutput = "<span>Hello</span><span> World </span>";
            when(documentHelper.parentNode.addChildren(siblingIndex(), new TextNode("World"))).thenReturn(null);
            TextNode textNode = new TextNode("Hello World");
            String result = textNode.outerHtmlHead(appendable, depth, document);
            assertEquals(expectedOutput, appendable.toString());
        }

        @Test
        public void toString_GivenTextNode_ReturnsOuterHtml() {
            Document document = documentHelper;
            Appendable appendable = new StringBuilder();
            int depth = 1;
            String expectedOutput = "<span>Hello</span><span> World </span>";
            when(documentHelper.parentNode.addChildren(siblingIndex(), new TextNode("World"))).thenReturn(null);
            TextNode textNode = new TextNode("Hello World");
            String result = textNode.toString();
            assertEquals(expectedOutput, appendable.toString());
        }

        @Test
        public void clone_GivenTextNode_ReturnsNewTextNode() {
            TextNode textNode = new TextNode("Hello World");
            Object result = documentHelper.documentHelper.clone();
            assertNotNull(result);
            assertEquals(textNode.text(), ((TextNode) result).text());
        }
    }

}