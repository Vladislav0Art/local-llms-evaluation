package org.jsoup.nodes;

public class GeneratedTestSplitTextOffsetTooHigh {

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
    public void testSplitTextOffsetTooHigh() throws org.junit.Assert AssertionError {
        String text = "Hello, World!";
        int offset = 10;
        try {
            TextNode node = new TextNode(text);
            node.splitText(offset);
            org.junit.Assert.fail("Expected IndexOutOfBoundsException");
        } catch (org.junit.TestNodeWithTextException e) {
            // Expected
        }
    }

}