package org.jsoup.nodes;

public class GeneratedTest_stripLeadingWhitespace {

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
    public void test_stripLeadingWhitespace() {
        // Test the stripLeadingWhitespace method with a test string
        String testString = "   This is a test   ";
        StringBuilder sb = new StringBuilder();
        TextNode.splitText(0, testString);
        String output = sb.toString();
        assertEquals("This is a test", output);
    }

}