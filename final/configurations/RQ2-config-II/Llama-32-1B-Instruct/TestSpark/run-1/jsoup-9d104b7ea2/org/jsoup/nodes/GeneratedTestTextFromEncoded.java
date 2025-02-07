package org.jsoup.nodes;

public class GeneratedTestTextFromEncoded {

    private TextNode node;
    private Document document;

    @Test
    public void testTextFromEncoded() {
        String encodedText = "Hello, World!";
        node = TextNode.createFromEncoded(encodedText);
        assertEquals(node.text(), "Hello, World!");
    }

    @Before
    public void setupDocument() {
        document = new Document();
        document.createElement("p").appendText("Hello, World!");
    }

}