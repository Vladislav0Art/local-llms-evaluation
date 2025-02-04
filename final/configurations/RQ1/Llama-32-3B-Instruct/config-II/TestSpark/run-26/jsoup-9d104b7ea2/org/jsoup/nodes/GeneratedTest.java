package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void newNode

    creationTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode node = new TextNode("test");
        int offset = -1;
        assertThrows(IllegalArgumentException.class, () -> node.splitText(offset));
    }

    @Test
    public void splitTextZeroOffsetTest() {
        TextNode node = new TextNode("test");
        int offset = 0;
        TextNode tailNode = node.splitText(offset);
        assertEquals(0, tailNode.text().length());
    }

    @Test
    public void textMethodReturnsEmptyStringForBlankNode() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

    @Test
    public void textMethodReturnsCorrectTextForNonBlankNode() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.text());
    }

    @Test
    public void cloneMethodTest() {
        TextNode node = new TextNode("test");
        TextNode cloned = node.clone();
        assertEquals(node, cloned);
    }

    @Test
    public void createFromEncodedMethodTest() {
        String encodedText = "&lt;test&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("<test>", node.text());
    }

}