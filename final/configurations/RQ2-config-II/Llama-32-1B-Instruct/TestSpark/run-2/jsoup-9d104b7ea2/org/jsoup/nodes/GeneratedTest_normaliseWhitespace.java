package org.jsoup.nodes;

public class GeneratedTest_normaliseWhitespace {

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
    public void test_normaliseWhitespace() {
        // Test the normaliseWhitespace method with a test string
        String testString = "   This is a test   ";
        String output = TextNode.normaliseWhitespace(testString);
        assertEquals("This is a test", output);
    }

}