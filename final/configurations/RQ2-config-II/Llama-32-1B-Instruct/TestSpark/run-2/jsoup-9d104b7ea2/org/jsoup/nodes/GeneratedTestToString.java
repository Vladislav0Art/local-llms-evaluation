package org.jsoup.nodes;

public class GeneratedTestToString {

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
    public void testToString() {
        // Test the toString method with an applicable document and a depth of 1
        createDocument();
        Document.OutputSettings out = new Document.OutputSettings(true);
        node.outerHtmlHead(out, 0); // Append HTML before toString
        String output = node.toString(0);
        assertEquals("This is a test", output);
    }

}