package org.jsoup.nodes;

public class GeneratedTest_text_createFromEncoded {

    private TextNode node;
    private Document document;

    public static void createDocument() throws IOException {
        // Create an empty document
        document = new Document();
    }

    @Before
    public void setup() {
        node = new TextNode("This is a test");
        createDocument();
    }

    @Test
    public void test_text_createFromEncoded() {
        // Create an encoded string and then convert it to a TextNode
        String encodedText = "text/plain; charset=utf-8";
        TextNode createdNode = TextNode.createFromEncoded(encodedText);
        assertEquals("This is a test", createdNode.text());
    }

}