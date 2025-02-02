package org.jsoup.nodes;

public class GeneratedTestCommentAsXmlDeclaration {

    private static MockMvc mockMvc;

    @Before
    public void setup() throws Exception {
        MockMvcBuilder builder = new MockMvcBuilder();
        mockMvc = builder.build();
    }

    @Test
    public void testCommentAsXmlDeclaration() throws Exception {
        String xmlDeclarationContent = "<!DOCTYPE HTML><html><body>Hello World!</body></html>";
        when(isXmlDeclaration(xmlDeclarationContent)).thenReturn(true);

        mockMvc.perform(get("/").contentType(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(content().string(xmlDeclarationContent));

        XmlDeclaration xmlDecl = (XmlDeclaration) Comment.asXmlDeclaration();
        assertEquals("Hello World!", xmlDecl.getContent());
    }

}