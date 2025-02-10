package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new MockMvcBuilder().withStandby(true).build());
    }

    @Test
    public void testIsBlank() throws Exception {
        // Arrange
        String text = "   ";
        when(toString()).thenReturn(text);

        // Act
        boolean result = TextNode.isBlank(this);

        // Assert
        assertTrue(result);
    }

}