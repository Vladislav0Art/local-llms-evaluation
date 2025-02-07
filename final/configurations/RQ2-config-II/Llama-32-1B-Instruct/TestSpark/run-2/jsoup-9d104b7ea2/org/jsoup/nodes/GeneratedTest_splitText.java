package org.jsoup.nodes;

public class GeneratedTest_splitText {

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
    public void test_splitText() {
        // Test the splitText method with an offset of 1 and then another offset of 2
        node.splitText(1); // Split at character 't'
        node.splitText(2); // Split at character 'a'
        assertEquals(4, node.getWholeText().length());
    }

}