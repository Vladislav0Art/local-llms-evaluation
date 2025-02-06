package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.Validate.isBlank;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private String text;

    @Mock
    private StringBuilder sb;

    private TextNode node = new TextNode(text);

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    public static void main(String[] args) throws Exception {
        org.junit.runner.JUnitCore.main("org.jsoup.nodes.TextNodeTest");
    }

    @Test
    public void text() {
        assertEquals(text, node.text());
        assertTrue(node.text().contains(text));
    }

    @Test
    public void nodeName() {
        assertNotNull(node.nodeName());
        assertEquals(TextNode.class.getSimpleName(), node.nodeName());
    }

    @Test
    public void getWholeText() {
        assertEquals(text, node.getWholeText());
        assertNotNull(node.getWholeText());
    }

    @Test
    public void isBlank() {
        assertFalse(isBlank(sb));
        assertTrue(node.isBlank());

        sb.setLength(0);
        assertTrue(node.isBlank());

        sb.append(' ');
        assertFalse(node.isBlank());
    }

    @Test
    public void outerHtmlHead() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        node.outerHtmlHead(accum, 0, out);

        assertNotNull(accum.toString());
        assertTrue(accum.toString().contains("<text>"));
        assertTrue(accum.toString().contains("</text>"));
    }

    @Test
    public void outerHtmlTail() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        node.outerHtmlTail(accum, 0, out);

        assertNotNull(accum.toString());
        assertTrue(accum.toString().contains("</text>"));
    }

    @Test
    public void toString() {
        assertNotNull(node.toString());
        assertTrue(node.toString().contains("<text>" + text + "</text>"));
    }

    @Test
    public void clone() {
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(text, cloned.text());
    }

    @Test
    public void splitText() {
        TextNode result = node.splitText(0);

        assertNotNull(result);
        assertEquals(node, result);
    }

}