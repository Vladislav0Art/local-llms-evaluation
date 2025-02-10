package org.jsoup.nodes;

public class GeneratedTestFromEncoded {

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new MockMvcBuilder().withStandby(true).build());
    }

    @Test
    public void testFromEncoded() throws Exception {
        // Arrange
        String encodedText = "Hello World!";
        when(createFromEncoded(encodedText)).thenReturn(new TextNode(encodedText));

        // Act
        TextNode result = this.fromEncoded();

        // Assert
        assertNotNull(result);
        assertEquals(encodedText, result.getText());
    }

}