package org.jsoup.nodes;

public class GeneratedTestSplitText {

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new MockMvcBuilder().withStandby(true).build());
    }

    @Test
    public void testSplitText() throws Exception {
        // Arrange
        String text = "Hello World!";
        when(coreValue()).thenReturn(text);

        TextNode splitResult = this.splitText(5);

        // Act
        assertNotNull(splitResult);

        // Assert
        assertEquals("<p>Hello</p><p>World!</p>", splitResult.getText());
    }

}