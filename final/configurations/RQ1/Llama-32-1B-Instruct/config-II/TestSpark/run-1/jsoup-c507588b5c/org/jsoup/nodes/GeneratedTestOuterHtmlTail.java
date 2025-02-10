package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new MockMvcBuilder().withStandby(true).build());
    }

    @Test
    public void testOuterHtmlTail() throws Exception {
        // Arrange
        String text = "Hello World!";
        when(getWholeText()).thenReturn(text);
        Document document = new Document();
        Appendable accum = new StringBuilder();

        when(outerHtmlTail(accum, 1, document)).thenReturn(true);

        // Act
        mockMvc.perform(request("GET", "/"))
                .andExpect(status().isOk())
                .andExpect(content().string(HTMLFormatter::format));
    }

}