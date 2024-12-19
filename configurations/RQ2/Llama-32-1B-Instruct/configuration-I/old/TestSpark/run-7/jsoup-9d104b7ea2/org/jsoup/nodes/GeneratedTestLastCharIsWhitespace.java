package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespace {

    private static MockMvc mockMvc;

    @Before
    public void setup() {
        // Initialize mock MVC for testing
        mockMvc = MockMvcBuilders.standaloneSetup(new TextNode()).build();
    }

    @Test
    public void testLastCharIsWhitespace() throws IOException {
        // Create a new text node with two substrings: "Hello" and "World"
        String text = "Hello World";
        TextNode textNode = new TextNode(text);

        // Check if the last character of each substring is whitespace
        Assert.assertTrue(lastCharIsWhitespace(textNode));
    }

}