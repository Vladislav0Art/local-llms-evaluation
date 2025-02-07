package org.jsoup.nodes;

public class GeneratedTest_outerHtmlTail {

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
    public void test_outerHtmlTail() {
        // Test the outerHtmlTail method with an applicable document and a depth of 1
        createDocument();
        Appendable accum = new StringBuilder();
        String output = node.outerHtmlTail(accum, 0);
        assertEquals("This is a test", output);
    }

}