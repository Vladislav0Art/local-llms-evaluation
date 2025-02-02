package org.jsoup.nodes;

public class GeneratedTestText {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }
}

class TestNodeTest {

    @Test
    public void testText() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        org.junit.Assert.assertEquals("Hello, World!", node.text());
    }

}