package org.jsoup.nodes;

public class GeneratedTest_nodeName {

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
    public void test_nodeName() {
        assertEquals("Text", node.nodeName());
    }

}