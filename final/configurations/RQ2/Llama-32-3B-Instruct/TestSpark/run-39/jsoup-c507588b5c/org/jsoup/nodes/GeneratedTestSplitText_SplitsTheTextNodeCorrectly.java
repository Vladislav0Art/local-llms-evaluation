package org.jsoup.nodes;

public class GeneratedTestSplitText_SplitsTheTextNodeCorrectly {

    private TextNode node;

    public GeneratedTest() {
        this.node = new TextNode();
    }

    @Test
    public void testSplitText_SplitsTheTextNodeCorrectly() throws IOException {
        node.setText("Hello World!");
        int offset = 6;
        String expected = "World!";
        String actual = node.splitText(offset);
        assertEquals(expected, actual);
    }

}