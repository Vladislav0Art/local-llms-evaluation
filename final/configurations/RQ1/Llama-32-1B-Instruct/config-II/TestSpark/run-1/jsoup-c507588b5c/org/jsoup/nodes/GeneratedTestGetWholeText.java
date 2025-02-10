package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new MockMvcBuilder().withStandby(true).build());
    }

    @Test
    public void testGetWholeText() throws Exception {
        // Arrange
        String text = "<p> Hello World </p>";
        when(getWholeText()).thenReturn(text);

        // Act
        String result = this.getText();

        // Assert
        assertEquals(text, result);
    }

}