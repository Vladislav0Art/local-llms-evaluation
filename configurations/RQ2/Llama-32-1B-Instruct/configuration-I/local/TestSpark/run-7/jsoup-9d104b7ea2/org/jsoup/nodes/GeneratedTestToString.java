package org.jsoup.nodes;

public class GeneratedTestToString {

    private static MockMvc mockMvc;

    @Before
    public void setup() {
        // Initialize mock MVC for testing
        mockMvc = MockMvcBuilders.standaloneSetup(new TextNode()).build();
    }

    @Test
    public void testToString() throws IOException {
        // Create a new text node with content "Hello"
        String text = "Hello";
        TextNode textNode = new TextNode(text);

        // Check if the string representation is correct
        Assert.assertEquals("Hello", textNode.toString());
    }

}