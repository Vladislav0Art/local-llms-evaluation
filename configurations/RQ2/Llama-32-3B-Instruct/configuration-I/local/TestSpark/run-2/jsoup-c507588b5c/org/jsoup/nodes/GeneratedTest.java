package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void newNodeTextIsBlankTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void newNodeTextNotEmptyTest() {
        TextNode node = new TextNode("Hello World");
        assertFalse(node.isBlank());
    }

    @Test
    public void textMethodReturnsWholeTextTest() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

    @Test
    public void textMethodReturnsNormalizedWhitespaceTest() {
        TextNode node = new TextNode(String.valueOf(Character.toChars('\u200B')));
        assertEquals("", node.text().trim());
    }

    @Test
    public void splitTextAtStartOfTextTest() {
        TextNode node = new TextNode("");
        TextNode splitNode = node.splitText(0);
        assertNull(splitNode);
    }

    @Test
    public void cloneMethodReturnsSameInstanceForBlankTextNode() {
        TextNode node = new TextNode("");
        TextNode clonedNode = node.clone();
        assertEquals(node, clonedNode);
    }

    @Test
    public void cloneMethodReturnsNewInstanceForNonBlankTextNode() {
        TextNode node = new TextNode("Hello World");
        TextNode clonedNode = node.clone();
        assertNotEquals(node, clonedNode);
    }

    @Test
    public void createFromEncodedMethodCreatesTextNodeWithCorrectTextTest() {
        String encodedText = "&lt;Hello&gt; &amp;World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("<Hello> & World", node.text());
    }

}