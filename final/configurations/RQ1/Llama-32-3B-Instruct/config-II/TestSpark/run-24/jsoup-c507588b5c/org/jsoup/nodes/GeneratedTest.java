package org.jsoup.nodes;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    public TextNode testTextNode() {
        return new TextNode("");
    }

    @Test
    public void createTextNode_EmptyText_ReturnsTextNode() {
        when(accum.length()).thenReturn(0);
        TextNode textNode = new TextNode(testTextNode());
        assertNotNull(textNode);
        assertTrue(StringUtil.isBlank(textNode.text()));
    }

    @Test
    public void nodeName() {
        TextNode textNode = testTextNode();
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void getWholeText_EmptyText_ReturnsEmptyString() {
        TextNode textNode = testTextNode();
        String text = textNode.getWholeText();
        assertTrue(text.isEmpty());
    }

    @Test
    public void isBlank() {
        TextNode textNode = testTextNode();
        assertTrue(textNode.isBlank());

        TextNode anotherTextNode = new TextNode(" ");
        anotherTextNode.text(" ");
        assertFalse(anotherTextNode.isBlank());
    }

    @Test
    public void splitText_SplitAtBeginning_ReturnsNewTextNodeWithSameText() {
        TextNode textNode = testTextNode();
        TextNode result = textNode.splitText(0);
        assertNotNull(result);
        assertEquals(textNode, result.splitText(0));
        assertTrue(StringUtil.isBlank(result.text()));
    }

    @Test
    public void splitText_SplitAtMiddle_ReturnsNewTextNodeWithSameText() {
        TextNode textNode = testTextNode();
        textNode.text("ab");
        TextNode result = textNode.splitText(1);
        assertNotNull(result);
        assertEquals(textNode, result.splitText(0));
        assertTrue(StringUtil.isBlank(result.text()));
    }

    @Test
    public void splitText_SplitAtEnd_ReturnsNewTextNodeWithSameText() {
        TextNode textNode = testTextNode();
        textNode.text("ab");
        TextNode result = textNode.splitText(textNode.text().length());
        assertNotNull(result);
        assertEquals(textNode, result.splitText(0));
        assertTrue(StringUtil.isBlank(result.text()));
    }

    @Test
    public void outerHtml() {
        TextNode textNode = testTextNode();
        StringBuilder builder = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true);
        try {
            textNode.outerHtmlHead(builder, 0, out);
            assertEquals("<span> </span>", builder.toString());
        } catch (IOException e) {
        }
    }

    @Test
    public void outerHtmlIndent() {
        TextNode textNode = testTextNode();
        StringBuilder builder = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true);
        try {
            textNode.outerHtmlHead(builder, 0, out);
            assertEquals("<span>    <span> </span></span>", builder.toString());
        } catch (IOException e) {
        }
    }
}

@Category(CoverageTest.class)
@RunWith(MockitoJUnitRunner.class)
public class TextNodeLeafNodeTests {

    @Mock
    private LeafNode parentNode;

    public TextNode testTextNode() {
        return new TextNode("");
    }

    @Test
    public void clone() {
        TextNode textNode = testTextNode();
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode, clonedTextNode);
    }
}

@Category(CoverageTest.class)
@RunWith(MockitoJUnitRunner.class)
public class TextNodeLeafNodeMethodsTests {

    @Mock
    private LeafNode parentNode;

    public TextNode testTextNode() {
        return new TextNode("");
    }

    @Test
    public void createFromEncoded() {
        String encodedText = "&lt;";
        when(Entities.unescape(encodedText)).thenReturn("&lt;");
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals("&&", textNode.text());
    }

    static class CoverageTest {
    }

}