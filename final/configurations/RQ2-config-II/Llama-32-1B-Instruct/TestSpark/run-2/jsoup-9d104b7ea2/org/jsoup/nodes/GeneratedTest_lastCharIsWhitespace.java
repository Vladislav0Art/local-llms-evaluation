package org.jsoup.nodes;

public class GeneratedTest_lastCharIsWhitespace {

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
    public void test_lastCharIsWhitespace() {
        // Test the lastCharIsWhitespace method with an applicable string builder
        String testStringBuilder = new StringBuilder("   ");
        assertTrue(TextNode.lastCharIsWhitespace(testStringBuilder));
    }

}