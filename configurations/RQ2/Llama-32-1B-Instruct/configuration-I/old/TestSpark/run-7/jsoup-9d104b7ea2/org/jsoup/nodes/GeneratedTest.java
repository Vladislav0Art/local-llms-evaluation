package org.jsoup.nodes;

public class GeneratedTest {

    private static MockMvc mockMvc;

    @Before
    public void setup() {
        // Initialize mock MVC for testing
        mockMvc = MockMvcBuilders.standaloneSetup(new TextNode()).build();
    }

    @Test
    public void testBlankTextNode() throws IOException {
        // Create a new text node with empty string content
        String text = "";
        TextNode textNode = new TextNode(text);

        // Check if the text node is blank
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void testEmptyDocumentText() throws IOException {
        // Create an empty document
        Document document = new Document();

        // Get all text nodes in the document
        NodeList nodeList = document.getElementsByTagName("text");

        // Check if there are any text nodes with content
        Assert.assertFalse(nodeList.getLength() == 0);

        // Clear the text content of each text node
        for (int i = 0; i < nodeList.getLength(); i++) {
            TextNode textNode = (TextNode) nodeList.item(i);
            textNode.setText("");
        }
    }

    @Test
    public void testSplitText() throws IOException {
        // Create a new text node with two substrings: "Hello" and "World"
        String text = "Hello World";
        TextNode textNode = new TextNode(text);

        // Split the text node at an offset of 5 characters
        int offset = 5;
        TextNode result = textNode.splitText(offset);

        // Check if the first substring is now in the original document
        Assert.assertTrue(document.getElementById("Hello") != null);
    }

    @Test
    public void testCreateTextNode() throws IOException {
        // Create a new text node with content "Hello"
        String text = "Hello";
        TextNode textNode = new TextNode(text);

        // Check if the text node's content is now correct
        Assert.assertEquals("Hello", textNode.getText());
    }

    @Test
    public void testClone() throws IOException {
        // Create a new text node with content "Hello"
        String text = "Hello";
        TextNode textNode = new TextNode(text);

        // Clone the text node
        TextNode clonedTextNode = textNode.clone();

        // Check if both text nodes have the same content
        Assert.assertEquals("Hello", textNode.getText());
    }

    @Test
    public void testToString() throws IOException {
        // Create a new text node with content "Hello"
        String text = "Hello";
        TextNode textNode = new TextNode(text);

        // Check if the string representation is correct
        Assert.assertEquals("Hello", textNode.toString());
    }

    @Test
    public void testNormaliseWhitespace() throws IOException {
        // Create a new text node with whitespace content
        String text = "   Hello  ";
        TextNode textNode = new TextNode(text);

        // Check if the normalised whitespace is correct
        Assert.assertEquals("Hello ", textNode.normaliseWhitespace());
    }

    @Test
    public void testStripLeadingWhitespace() throws IOException {
        // Create a new text node with whitespace content
        String text = "   Hello  ";
        TextNode textNode = new TextNode(text);

        // Check if the stripped leading whitespace is correct
        Assert.assertEquals("", textNode.stripLeadingWhitespace());
    }

    @Test
    public void testLastCharIsWhitespace() throws IOException {
        // Create a new text node with two substrings: "Hello" and "World"
        String text = "Hello World";
        TextNode textNode = new TextNode(text);

        // Check if the last character of each substring is whitespace
        Assert.assertTrue(lastCharIsWhitespace(textNode));
    }

    @Test
    public void testFromEncoded() throws IOException {
        // Create a new text node from encoded HTML data
        String encodedText = "&lt;Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // Check if the text node's content is correct
        Assert.assertEquals("Hello", textNode.getText());
    }

}