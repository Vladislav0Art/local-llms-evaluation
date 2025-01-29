package org.jsoup.nodes;

public class GeneratedTestExpectForm {

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
    public void testExpectForm() throws Exception {
        when(document.expectForm("testCssQuery")).thenReturn(new DocumentElementBuilder()
                .addElement(new ElementTag(), "div", new Elements<>())
                .build());
        mockMvc.perform(get("http://example.com/testCssQuery"))
                .andExpect().contentType("text/html; charset=UTF-8")
                .andExpect().status(200)
                .andExpect().body(document.expectForm("testCssQuery"));
    }

}