package org.jsoup.nodes;

public class GeneratedTestLocation {

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
    public void testLocation() throws Exception {
        when(document.location()).thenReturn("/path/to/page");
        String actualLocation = mockMvc.perform(get())
                .andExpect().contentType("text/html; charset=UTF-8")
                .andExpect().status(200)
                .andExpect().body(document.location());
        assertEquals("/path/to/page", actualLocation);
    }

}