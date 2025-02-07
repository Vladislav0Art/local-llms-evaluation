package org.jsoup.nodes;

public class GeneratedTestClone {

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
    public void testClone() {
        // Test the clone method with an applicable document and a depth of 1
        createDocument();
        Document.OutputSettings out = new Document.OutputSettings(true);
        Appendable accum = new StringBuilder();
        node.outerHtmlHead(accum, 0); // Append HTML before toString
        String output = node.toString(0);
        TextNode clonedNode = (TextNode) node.clone();
        assertEquals(output, clonedNode.toString(0));
    }

}