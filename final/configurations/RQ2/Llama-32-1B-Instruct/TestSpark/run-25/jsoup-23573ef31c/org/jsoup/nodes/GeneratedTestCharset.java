package org.jsoup.nodes;

public class GeneratedTestCharset {

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
    public void testCharset() throws Exception {
        when(document.charset()).thenReturn(new CharsetEncoder(Charset.forName("ISO-8859-1"), false, true));
        mockMvc.perform(get())
                .andExpect().contentType("text/html; charset=ISO-8859-1")
                .andExpect().status(200)
                .andExpect().body(document.charset());
    }

}