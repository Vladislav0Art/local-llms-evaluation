package org.jsoup.nodes;

public class GeneratedTestSplitText {

    private TextNode node;
    private Document document;

    @Test
    public void testSplitText() {
        String text = "Hello";
        node = new TextNode(text);
        assertEquals(2, node.splitText(0));
        assertEquals("Hello", node.getWholeText());
    }

    @Before
    public void setupDocument() {
        document = new Document();
        for (int i = 0; i < 100; i++) {
            node = document.createElement("p").appendText(String.valueOf(i));
            if (i % 10 == 0) {
                node = document.createSpan().appendText(" ");
            }
        }
    }

}