package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
public class GeneratedTest {

"classpath*:test.xml"
})

public class TextNodeTest {

    @Mock
    private Document document;

    @Mock
    private Element parent;

    @Autowired
    private StringUtil stringUtil;

    public static final String TEXT_NODE_TEXT = "Hello World";
    public static final String TRIMMED_TEXT_NODE_TEXT = "Hello World";

    @Test
    public void createTextNodeFromText_ReturnsTextNode() {
        TextNode textNode = new TextNode(TEXT_NODE_TEXT);
        assertNotNull(textNode);
    }

    @Test
    public void nodeName_ReturnsCorrectString() {
        TextNode textNode = new TextNode(TEXT_NODE_TEXT);
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void getWholeText_ReturnsCorrectString() {
        TextNode textNode = new TextNode(TEXT_NODE_TEXT);
        assertEquals(TEXT_NODE_TEXT, textNode.getWholeText());
    }

    @Test
    public void text_ReturnsTrimmedString() {
        String trimmedText = stringUtil.stripLeadingWhitespace("   Hello World  ");
        assertNotNull(trimmedText);
        assertEquals(TRIMMED_TEXT_NODE_TEXT, trimmedText);
    }

    @Test
    public void isBlank_ReturnsCorrectBoolean() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitText_ReturnsCorrectTextNode() throws Exception {
        TextNode textNode = new TextNode(TEXT_NODE_TEXT);
        int offset = 7;
        String substring = "Hello";
        TextNode result = (TextNode) textNode.splitText(offset);
        assertEquals(substring, result.text());
    }

    @Test
    public void outerHtmlHead_TrimmingWorksCorrectly() throws Exception {
        Appendable appendable = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        TextNode textNode = new TextNode("   Hello World  ");
        new TextNode().outerHtmlHead(appendable, 0, outputSettings);
        assertEquals("Hello World", appendable.toString());
    }

    @Test
    public void outerHtmlTail_HasNoSideEffects() throws Exception {
        Appendable appendable = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlHead(appendable, 0, outputSettings);
        assertTrue(applicable.toString().isEmpty());
    }

    @Test
    public void clone_ReturnsCorrectTextNode() {
        TextNode textNode = new TextNode(TEXT_NODE_TEXT);
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode, clonedTextNode);
    }

}