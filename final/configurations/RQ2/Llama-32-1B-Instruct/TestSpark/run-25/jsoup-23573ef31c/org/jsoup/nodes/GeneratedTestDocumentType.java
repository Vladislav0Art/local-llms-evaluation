package org.jsoup.nodes;

public class GeneratedTestDocumentType {

    private MockMvc mockMvc;

    @Mock
    private Connection mockConnection;

    private Document document;

    @Before
    public void setup() {
        this.mockMvc = new MockMvc(this::mockRequest);
        this.document = org.jsoup.nodes.Document.createShell("http://example.com");
    }

    @Test
    public void testDocumentType() throws Exception {
        when(document.documentType()).thenReturn(new DocumentType("application/xhtml+xml"));
        String actualDocumentType = mockMvc.perform(get())
                .andExpect().contentType("text/html; charset=UTF-8")
                .andExpect().status(200)
                .andExpect().body(document.documentType());
        assertEquals("application/xhtml+xml", actualDocumentType);
    }

}