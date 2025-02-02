package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public static TextNode createTextNodeFromEncoded(String encodedText) {
        return new TextNode();
    }
}

public class GeneratedTest {

    @Test
    public void createTextNodeEmptyStringTest() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.text().isEmpty());
    }

    @Test
    public void createTextNodeSingleCharacterTest() {
        String text = "a";
        TextNode node = new TextNode(text);
        assertEquals("a", node.text());
    }

    @Test
    public void createTextNodeMultipleCharactersTest() {
        String text = "ab c";
        TextNode node = new TextNode(text);
        assertEquals("ab c", node.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textMethodReturnsNormalisedWhitespaceTest() {
        String text = "  ";
        TextNode node = new TextNode(text);
        assertEquals(StringUtil.normaliseWhitespace("  "), node.text());
    }

    @Test
    public void textSetTest() {
        String text = "ab c";
        TextNode node = new TextNode("");
        node.text(text);
        assertEquals(text, node.text());
    }

    @Test
    public void getWholeTextReturnsEncodedTextTest() {
        String encodedText = "&lt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, node.getWholeText());
    }

    @Test
    public void isBlankTestFalseTest() {
        TextNode node = new TextNode("ab c");
        assertFalse(node.isBlank());
    }

    @Test
    public void isBlankTestTrueTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void toStringTest() {
        String text = "ab c";
        TextNode node = new TextNode(text);
        assertEquals("<p>ab c</p>", node.toString());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("ab c");
        TextNode cloned = node.clone();
        assertEquals(node.text(), cloned.text());
    }

}