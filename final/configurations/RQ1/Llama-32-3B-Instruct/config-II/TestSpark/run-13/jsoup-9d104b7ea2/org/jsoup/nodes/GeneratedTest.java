package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Document document;

    public TextNode createTextNode() {
        return new TextNode("Test");
    }

    public String testText() {
        return "Test";
    }

    public TextNode splitText() {
        return createTextNode();
    }

    public TextNode textTextNode() {
        return createTextNode();
    }

    @Test
    public void [TextNodeConstruct]

    Test() {
        TextNode textNode = createTextNode();
        assertNotNull(textNode);
    }

    @Test
    public void [TextNodeGetWholeText][BlankTest]

    Test() {
        when(document.getNodeValue()).thenReturn("");
        TextNode textNode = createTextNode();
        assertEquals("", textNode.getWholeText());
    }

    @Test
    public void [TextNodeGetWholeText][NotEmptyTest]

    Test() {
        when(document.getNodeValue()).thenReturn("Test");
        TextNode textNode = createTextNode();
        assertEquals("Test", textNode.getWholeText());
    }

    @Test
    public void [TextNodeSet][BlankTest]

    Test() {
        TextNode textNode = createTextNode();
        textNode.text("");
        assertNotNull(textNode);
    }

    @Test
    public void [TextNodeSet][NotEmptyTest]

    Test() {
        TextNode textNode = createTextNode();
        String text = "Test";
        textNode.text(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void [TextNodeBlankCheck]

    Test() {
        when(document.getNodeValue()).thenReturn("");
        assertTrue(createTextNode().isBlank());
    }

    @Test
    public void [TextNodeSplit][EmptyTextTest]

    Test() {
        TextNode textNode = createTextNode();
        TextNode resultNode = textNode.splitText(0);
        assertNotNull(resultNode);
        assertEquals("", resultNode.text());
    }

    @Test
    public void [TextNodeSplit][NotEmptyTextTest]

    Test() {
        when(document.getNodeValue()).thenReturn("Test");
        TextNode textNode = createTextNode();
        TextNode resultNode = textNode.splitText(1);
        assertNotNull(resultNode);
        assertEquals("Test", resultNode.text());
    }

    @Test
    public void [TextNodeOuterHtml][EmptyText]

    Test() {
        TextNode textNode = createTextNode();
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        document.outerHtmlHead(accum, 0, out);
        assertNotNull(accum);
    }

    @Test
    public void [TextNodeOuterHtml][NotEmptyText]

    Test() {
        when(document.getNodeValue()).thenReturn("Test");
        TextNode textNode = createTextNode();
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        document.outerHtmlHead(accum, 0, out);
        assertNotNull(accum);
    }

    @Test
    public void [TextNodeOuterHtml][Trim]

    Test() {
        TextNode textNode = createTextNode(" Test ");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        document.outerHtmlHead(accum, 0, out);
        assertNotNull(accum);
    }

    @Test
    public void [TextNodeClone]

    Test() {
        TextNode textNode = createTextNode();
        TextNode clone = textNode.clone();
        assertEquals(textNode, clone);
    }

}