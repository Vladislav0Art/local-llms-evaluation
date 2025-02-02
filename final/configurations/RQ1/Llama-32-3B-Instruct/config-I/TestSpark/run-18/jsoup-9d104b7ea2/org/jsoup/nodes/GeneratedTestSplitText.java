package org.jsoup.nodes;

public class GeneratedTestSplitText {

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
    public void testSplitText() throws org.junit.Assert AssertionError {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        int offset = 5;
        org.junit.Assert.assertTrue(node.splitText(offset) instanceof org.junit.TestNodeWithText);
        org.junit.Assert.assertEquals("World!", ((org.junit.TestNodeWithText) node.splitText(offset)).text());
    }

}