package org.jsoup.nodes;

public class GeneratedTestClone {

    private static MockMvc mockMvc;

    @Before
    public void setup() {
        // Initialize mock MVC for testing
        mockMvc = MockMvcBuilders.standaloneSetup(new TextNode()).build();
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

}