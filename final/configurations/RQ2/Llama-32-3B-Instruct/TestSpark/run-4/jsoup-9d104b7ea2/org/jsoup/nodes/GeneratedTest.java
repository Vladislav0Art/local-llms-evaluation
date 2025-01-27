package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public TextNode testTreeNode() {
        return new TextNode("test");
    }

    @Test
    public void textNodeNodeNameTest() {
        TextNode node = new TextNode("test");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void textNodeTextTest() {
        TextNode node = testTreeNode();
        assertEquals("test", node.text());
    }

    @Test
    public void textNodeCloneTest() {
        TextNode original = testTreeNode();
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertTrue(original.equals(cloned));
    }

    @Test
    public void textNodeSplitTextTest() {
        TextNode node = new TextNode("test");
        TextNode split = node.splitText(1);
        assertEquals("te", split.text());
        assertEquals("st", node.text());
    }

    @Test
    public void textNodeGetWholeTextTest() {
        TextNode node = testTreeNode();
        assertEquals("test", node.getWholeText());
    }

    @Test
    public void textNodeIsBlankTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
        assertFalse(testTreeNode().isBlank());
    }

    @Test
    public void textNodeOuterHtmlHeadTest() {
        TextNode node = testTreeNode();
        try {
            node.outerHtmlHead(appendable, 0, document.OutputSettings.empty());
            fail("Expected IOException");
        } catch (IOException e) {
        }

        node.outerHtmlHead(new StringBuilder(), 0, document.OutputSettings.empty());
    }

    @Test
    public void textNodeOuterHtmlTailTest() {
        TextNode node = testTreeNode();
        try {
            node.outerHtmlTail(appendable, 0, document.OutputSettings.empty());
            fail("Expected IOException");
        } catch (IOException e) {
        }

        node.outerHtmlTail(new StringBuilder(), 0, document.OutputSettings.empty());
    }

    @Test
    public void textNodeToStringTest() {
        TextNode node = testTreeNode();
        assertEquals("TextNode{...}", node.toString());
    }

    @Test
    public void textNodecreateFromEncodedTest() {
        String encodedText = "encoded";
        TextNode created = TextNode.createFromEncoded(encodedText);
        assertNotNull(created);
    }

    @Test
    public void normaliseWhitespaceTest() {
        assertEquals("  ", StringUtil.normaliseWhitespace("   "));
        assertEquals("", StringUtil.normaliseWhitespace(""));
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        assertEquals("", StringUtil.stripLeadingWhitespace("   "));
        assertEquals("test", StringUtil.stripLeadingWhitespace("test"));
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        assertTrue(StringBuilder.lastCharIsWhitespace(new StringBuilder(" ")));
        assertFalse(StringBuilder.lastCharIsWhitespace(new StringBuilder("abc")));
    }

}