package org.jsoup.nodes;

public class GeneratedTestCommentIsXmlDeclarationData {

    private static MockMvc mockMvc;

    @Before
    public void setup() throws Exception {
        MockMvcBuilder builder = new MockMvcBuilder();
        mockMvc = builder.build();
    }

    @Test
    public void testCommentIsXmlDeclarationData() throws Exception {
        String xmlDeclarationContent = "<!DOCTYPE HTML><html><body>Hello World!</body></html>";
        when(isXmlDeclaration(xmlDeclarationContent)).thenReturn(true);

        mockMvc.perform(get("/").contentType(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(content().string(xmlDeclarationContent));

        assertEquals(true, Comment.isXmlDeclarationData(xmlDeclarationContent));
    }

}