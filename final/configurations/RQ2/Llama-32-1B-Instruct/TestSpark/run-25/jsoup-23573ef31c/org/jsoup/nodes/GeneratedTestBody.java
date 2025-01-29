package org.jsoup.nodes;

public class GeneratedTestBody {

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
    public void testBody() throws Exception {
        when(document.body()).thenReturn(new Elements<>() {{
            add(new ElementBody(""));
        }});
        mockMvc.perform(get())
                .andExpect().contentType("text/html; charset=UTF-8")
                .andExpect().status(200)
                .andExpect().body(document.body());
    }

}