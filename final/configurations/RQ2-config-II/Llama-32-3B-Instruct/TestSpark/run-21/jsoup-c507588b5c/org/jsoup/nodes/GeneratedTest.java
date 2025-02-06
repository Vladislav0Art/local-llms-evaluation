package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void newNodeText_Empty() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
        assertFalse(node.isBlank());
    }

    @Test
    public void newNodeText_SingleCharacter() {
        TextNode node = new TextNode("a");
        assertEquals("a", node.text());
        assertFalse(node.isBlank());
    }

    @Test
    public void newNodeText_MultipleCharacters() {
        TextNode node = new TextNode("abc");
        assertEquals("abc", node.text());
        assertFalse(node.isBlank());
    }

    @Test
    public void normaliseWhitespace_NoWhitespace() {
        String text = "hello";
        assertEquals("hello", StringUtil.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespace_EmptyText() {
        String text = "";
        assertEquals("", StringUtil.stripLeadingWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespace_SingleSpace() {
        String text = " ";
        assertEquals(" ", StringUtil.stripLeadingWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespace_MultipleSpaces() {
        String text = "   ";
        assertEquals("   ", StringUtil.stripLeadingWhitespace(text));
    }

    @Test
    public void splitText_NoOffset() {
        TextNode node = new TextNode("abcdefg");
        TextNode result = node.splitText(0);
        assertEquals(node, result);
    }

    @Test
    public void splitText_MiddleOffset() {
        TextNode node = new TextNode("abcdefg");
        TextNode result1 = node.splitText(3);
        TextNode result2 = node.splitText(4);
        assertFalse(result1.equals(node));
        assertTrue(result2.equals(node));
    }

    @Test
    public void createFromEncoded_Empty() {
        String encodedText = "";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("", node.text());
        assertFalse(node.isBlank());
    }

}