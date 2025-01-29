package org.jsoup.nodes;

public class GeneratedTestForms {

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
    public void testForms() throws Exception {
        when(document.forms()).thenReturn(new FormElement<>() {{
            add(new FormElement.FormElementBuilder()
                    .add("form1", new Elements<>()));
            add(new FormElement.FormElementBuilder()
                    .add("form2", new Elements<>()));
        }});
        mockMvc.perform(get())
                .andExpect().contentType("text/html; charset=UTF-8")
                .andExpect().status(200)
                .andExpect().body(document.forms());
    }

}