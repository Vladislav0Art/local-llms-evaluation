package org.jsoup.nodes;

public class GeneratedTestClone {

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new MockMvcBuilder().withStandby(true).build());
    }

    @Test
    public void testClone() throws Exception {
        // Arrange
        String text = "<p>Hello World!</p>";
        when(getWholeText()).thenReturn(text);
        TextNode cloneResult = this.clone();

        // Act
        assertNotNull(cloneResult);

        // Assert
        assertEquals(text, cloneResult.getText());
    }

}