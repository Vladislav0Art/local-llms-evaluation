package org.jsoup.nodes;

public class GeneratedTestParser {

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
    public void testParser() throws Exception {
        when(mockConnection).thenReturn(new Connection(10000, "http://example.com"));
        mockMvc.perform(get())
                .andExpect().contentType("text/html; charset=UTF-8")
                .andExpect().status(200)
                .andExpect().body(document.parser());
    }

}