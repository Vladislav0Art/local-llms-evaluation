package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testIsBlank_EmptyString() {
        assertEquals(false, TextNode.isBlank(""));
    }

    @Test
    public void testIsBlank_DifferentEmptyStrings() {
        assertEquals(true, TextNode.isBlank("  "));
        assertEquals(true, TextNode.isBlank("\t "));
        assertEquals(false, TextNode.isBlank("hello"));
    }

    @Test
    public void testText_EqualUnescapedString() {
        assertEquals("", TextNode.createTextNode("   "));
        assertEquals("\n", TextNode.createTextNode("\n   "));
        assertEquals("\\\\n", TextNode.createTextNode("\\\\n  "));
    }

    @Test
    public void testText_EqualEncodedString() {
        TextNode text = new TextNode("Hello, World!");
        assertEquals("Hello, World!", text.getText());
    }

    @Test
    public void testSplitText_SplittingOneNode() {
        String text = "   hello   ";
        TextNode node1 = new TextNode(text.substring(0, 4));
        TextNode node2 = new TextNode(text.substring(5, 8));
        assertEquals(node1, TextNode.splitText(3));
    }

    @Test
    public void testSplitText_SplittingMultipleNodes() {
        String text = "   hello   \\n  world  \\\\n   ";
        TextNode node1 = new TextNode(text.substring(0, 4));
        TextNode node2 = new TextNode(text.substring(5, 8));
        TextNode node3 = new TextNode(text.substring(11, 14));
        assertEquals(node1, TextNode.splitText(4));
    }

    @Test
    public void testSplitText_SplittingSameNode() {
        String text = "   hello   ";
        TextNode node = new TextNode(text);
        TextNode node2 = new TextNode(node.getText());
        assertEquals(node, TextNode.splitText(3));
    }

    @Test
    public void testSplitText_DifferentOffset() {
        String text = "   hello   \\n  world  \\\\n   ";
        TextNode node1 = new TextNode(text.substring(0, 4));
        TextNode node2 = new TextNode(text.substring(5, 8));
        TextNode node3 = new TextNode(text.substring(11, 14));
        assertEquals(node1, TextNode.splitText(3));
    }

    @Test
    public void testSplitText_DifferentOffsetDifferentNode() {
        String text = "   hello   \\n  world  \\\\n   ";
        TextNode node1 = new TextNode(text.substring(0, 4));
        TextNode node2 = new TextNode(text.substring(5, 8));
        assertEquals(node2, TextNode.splitText(3));
    }

    @Test
    public void testSplitText_DifferentOffsetNoNode() {
        String text = "   hello   \\n  world  \\\\n   ";
        assertEquals(null, TextNode.splitText(4));
    }

    @Test
    public void testGetWholeText_EqualUnescapedString() {
        TextNode text = new TextNode("   ");
        assertEquals("", text.getText());
    }

    @Test
    public void testGetWholeText_DifferentUnescapedStrings() {
        TextNode text1 = new TextNode("   ");
        TextNode text2 = new TextNode("\n  hello  \n");
        assertEquals("   ", text1.getText());
        assertEquals("\\n  hello  \\n", text2.getText());
    }

    @Test
    public void testGetWholeText_DifferentEncodedStrings() {
        TextNode text1 = new TextNode(Entities.unescape("Hello, World!"));
        TextNode text2 = new TextNode(Entities.unescape("\n  hello  \n"));
        assertEquals("Hello, World!", text1.getText());
        assertEquals("\\n  hello  \\n", text2.getText());
    }

    @Test
    public void testToString_SimpleText() {
        assertEquals("   ", new TextNode("").toString());
    }

}