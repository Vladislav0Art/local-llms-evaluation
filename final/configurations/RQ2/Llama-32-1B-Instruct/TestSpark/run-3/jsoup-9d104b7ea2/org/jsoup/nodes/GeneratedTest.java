package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testnodeName() throws Exception {
        assertEquals("text", node.nodeName());
    }

    @Test
    public void testText() throws Exception {
        assertEquals("Hello World", node.text());
    }

    @Test
    public void testTextNode() throws Exception {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
    }

    @Test
    public void testGetWholeText() throws Exception {
        String expected = "Hello World";
        String actual = node.getWholeText();
        assertEquals(expected, actual);
    }

    @Test
    public void testIsBlank() throws Exception {
        assertTrue(node.isBlank());
    }

    @Test
    public void testSplitText() throws Exception {
        TextNode textNode = new TextNode("Hello World");
        String expected = "Hello   World";
        assertEquals(expected, textNode.splitText(0));
    }

    @Test
    public void testOuterHtmlHead() throws Exception {
        when(node.outerHtmlHead(any(), any(), any())).thenReturn("<div>Test</div>");
        node.outerHtmlHead(new Appendable(), 1, Document.OutputSettings.class);
        String expected = "<div>Test</div>";
        assertEquals(expected, new java.util.StringJoiner().add("Test").toString());
    }

    @Test
    public void testOuterHtmlTail() throws Exception {
        when(node.outerHtmlTail(any(), any(), any())).thenReturn("<div>Test</div>");
        node.outerHtmlTail(new Appendable(), 1, Document.OutputSettings.class);
        String expected = "<div>Test</div>";
        assertEquals(expected, new java.util.StringJoiner().add("Test").toString());
    }

    @Test
    public void testToString() throws Exception {
        String expected = "text";
        assertEquals(expected, node.toString());
    }

    @Test
    public void testClone() throws Exception {
        TextNode clone = node.clone();
        assertNotNull(clone);
    }

}