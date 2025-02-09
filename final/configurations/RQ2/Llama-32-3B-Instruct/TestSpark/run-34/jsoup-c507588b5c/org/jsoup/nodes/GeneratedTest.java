package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void nodeName_WillReturnNodeName() {
        TextNode node = new TextNode("node");
        assertEquals("node", node.nodeName());
    }

    @Test
    public void text_WillReturnText() {
        TextNode node = new TextNode("text");
        assertEquals("text", node.text());
    }

    @Test
    public void nodeNameWillReturnEmptyStringForBlankTextNode() {
        TextNode node = new TextNode("");
        assertEquals("", node.nodeName());
    }

    @Test
    public void getWholeText_WillReturnEmptyStringForBlankTextNode() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

    @Test
    public void isBlank_WillReturnTrueForBlankTextNode() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void splitText_SplitsTextAtGivenOffset() throws IOException {
        TextNode node = new TextNode("text");
        TextNode leftPart = node.splitText(3);
        String rightPart = leftPart.text();
        assertEquals("te", rightPart);
        assertEquals("xt", node.text());
    }

    @Test
    public void normaliseWhitespace_WillNotChangeInputString() {
        String input = "   ";
        String expected = "   ";
        assertEquals(expected, TextNode.normaliseWhitespace(input));
    }

    @Test
    public void stripLeadingWhitespaceWillReturnEmptyStringForInputWithLeadingWhitespaces() {
        String input = "   text";
        String expected = "";
        assertEquals(expected, TextNode.stripLeadingWhitespace(input));
    }

    @Test
    public void lastCharIsWhitespaceWillReturnTrueForEmptyStringBuilder() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void cloneCreatesNewTextNodeWithSameProperties() {
        TextNode node = new TextNode("text");
        TextNode cloned = node.clone();
        assertEquals(node.nodeName(), cloned.nodeName());
        assertEquals(node.text(), cloned.text());
    }

}