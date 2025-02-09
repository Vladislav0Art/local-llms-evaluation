package org.jsoup.nodes;

public class GeneratedSplitText_SplitsTheTextNodeCorrectly {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void splitText_SplitsTheTextNodeCorrectly() throws IOException {
        int offset = 6;
        TextNode expected = new TextNode("World!");
        String actual = node.splitText(offset).toString();
        assertEquals(expected.text(), actual, 0.01);
    }

}