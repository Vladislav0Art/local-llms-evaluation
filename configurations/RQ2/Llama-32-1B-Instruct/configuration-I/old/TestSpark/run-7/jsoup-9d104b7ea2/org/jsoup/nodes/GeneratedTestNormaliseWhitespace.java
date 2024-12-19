package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

    private static MockMvc mockMvc;

    @Before
    public void setup() {
        // Initialize mock MVC for testing
        mockMvc = MockMvcBuilders.standaloneSetup(new TextNode()).build();
    }

    @Test
    public void testNormaliseWhitespace() throws IOException {
        // Create a new text node with whitespace content
        String text = "   Hello  ";
        TextNode textNode = new TextNode(text);

        // Check if the normalised whitespace is correct
        Assert.assertEquals("Hello ", textNode.normaliseWhitespace());
    }

}