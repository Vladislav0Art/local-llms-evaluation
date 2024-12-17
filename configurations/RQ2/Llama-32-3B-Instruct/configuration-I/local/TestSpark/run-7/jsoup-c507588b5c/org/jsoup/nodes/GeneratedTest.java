package org.jsoup.nodes;

public class GeneratedTest {

    private String value;

    public TextNode(String value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TextNode) {
            return value.equals(((TextNode) obj).value);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return value.hashCode();
    }

    public boolean isEmpty() {
        return value.isEmpty();
    }

    public String getNodeId() {
        return "node" + System.currentTimeMillis();
    }

    public void setText(String value) {
        this.value = value;
    }
}

public class TextNodeTest {

    @Test
    public void textNodeCreation_SimpleText_Test() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void textNodeCreation_EmptyString_Test() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_NoWhitespaceNodes_SimpleString_Test() {
        String text = "Hello World";
        assertTrue(new TextNode(text).isBlank());
    }

    @Test
    public void isBlank_WhitespaceNodes_EmptyString_Test() {
        String text = "\n";
        assertTrue(new TextNode(text).isBlank());
    }

    @Test
    public void textNodeCreation_NullText_Test() throws Exception {
        try {
            new TextNode(null);
            throw new Exception();
        } catch (Exception e) {
            // Expected
        }
    }

    @Test
    public void testTextNodeEquals() {
        TextNode textNode1 = new TextNode("test");
        TextNode textNode2 = new TextNode("test");

        assertEquals(true, textNode1.equals(textNode2));
    }

    @Test
    public void testTextNodeNotEquals() {
        TextNode textNode1 = new TextNode("test");
        TextNode textNode2 = new TextNode("different");

        assertNotEquals(false, textNode1.equals(textNode2));
    }

}