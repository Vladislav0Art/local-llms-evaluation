package org.jsoup.nodes;

public class GeneratedTestCommentSetData {

    private static MockMvc mockMvc;

    @Before
    public void setup() throws Exception {
        MockMvcBuilder builder = new MockMvcBuilder();
        mockMvc = builder.build();
    }

    @Test
    public void testCommentSetData() throws Exception {
        String xmlDeclarationContent = "<!DOCTYPE HTML><html><body>Hello World!</body></html>";
        when(isXmlDeclaration(xmlDeclarationContent)).thenReturn(true);

        mockMvc.perform(post("/").contentType(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(content().string(xmlDeclarationContent));

        Comment comment = new Comment("Hello World!");
        assertEquals(comment, comment.setData("Hello World!"));
    }

}