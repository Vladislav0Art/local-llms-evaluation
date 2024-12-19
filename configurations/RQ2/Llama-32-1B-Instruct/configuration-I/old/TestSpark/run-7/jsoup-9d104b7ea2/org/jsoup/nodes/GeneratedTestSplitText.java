package org.jsoup.nodes;

public class GeneratedTestSplitText {

    private static MockMvc mockMvc;

    @Before
    public void setup() {
        // Initialize mock MVC for testing
        mockMvc = MockMvcBuilders.standaloneSetup(new TextNode()).build();
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

}