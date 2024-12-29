package org.jsoup.nodes;

public class GeneratedCreateFromEncoded {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public void clone() throws CloneNotSupportedException {
        return (TextNode) super.clone();
    }

    public static Document document() {
        Document doc = new Document();
        // implementation
        return doc;
    }
}

public class GeneratedTest {

    @Test
    public void createFromEncoded() {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

    static {
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
        Document document = TextNode.document();
        StringBuilder output = new StringBuilder(document.outerHtmlHead(null, null));
        // implementation
    }

}