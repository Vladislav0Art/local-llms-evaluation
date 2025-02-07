package org.jsoup.nodes;

public class GeneratedTest_text {

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
    public void test_text() {
        String text = "This is a test";
        node.text(text);
        assertEquals(text, document.getText(node.position()));
    }

}