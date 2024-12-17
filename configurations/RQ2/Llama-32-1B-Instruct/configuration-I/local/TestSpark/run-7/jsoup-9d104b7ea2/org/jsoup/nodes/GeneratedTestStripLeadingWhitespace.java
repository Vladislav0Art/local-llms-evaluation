package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

    private static MockMvc mockMvc;

    @Before
    public void setup() {
        // Initialize mock MVC for testing
        mockMvc = MockMvcBuilders.standaloneSetup(new TextNode()).build();
    }

    @Test
    public void testStripLeadingWhitespace() throws IOException {
        // Create a new text node with whitespace content
        String text = "   Hello  ";
        TextNode textNode = new TextNode(text);

        // Check if the stripped leading whitespace is correct
        Assert.assertEquals("", textNode.stripLeadingWhitespace());
    }

}