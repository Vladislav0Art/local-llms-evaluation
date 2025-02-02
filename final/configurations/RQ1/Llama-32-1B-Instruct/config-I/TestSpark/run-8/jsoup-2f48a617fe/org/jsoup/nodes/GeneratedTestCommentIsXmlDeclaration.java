package org.jsoup.nodes;

public class GeneratedTestCommentIsXmlDeclaration {

    private static MockMvc mockMvc;

    @Before
    public void setup() throws Exception {
        MockMvcBuilder builder = new MockMvcBuilder();
        mockMvc = builder.build();
    }

    @Test
    public void testCommentIsXmlDeclaration() throws Exception {
        String xmlDeclarationContent = "<!DOCTYPE html><html><body>Hello World!</body></html>";
        when(isXmlDeclaration(xmlDeclarationContent)).thenReturn(true);

        mockMvc.perform(get("/").contentType(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(content().string(xmlDeclarationContent));
    }

}