package org.jsoup.nodes;

public class GeneratedTestFromEncoded {

    private static MockMvc mockMvc;

    @Before
    public void setup() {
        // Initialize mock MVC for testing
        mockMvc = MockMvcBuilders.standaloneSetup(new TextNode()).build();
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