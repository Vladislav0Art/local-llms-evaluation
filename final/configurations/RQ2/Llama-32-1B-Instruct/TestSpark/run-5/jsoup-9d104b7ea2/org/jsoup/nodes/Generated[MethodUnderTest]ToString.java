package org.jsoup.nodes;

public class Generated[MethodUnderTest]

ToString {

    private static MockHttpServletRequest request;

    @Before
    public void setup () {
        String encodedText = "{\"hello:world\"";
        request = new MockHttpServletRequest();
        request.setMethod("POST");
        request.getParameterMap().put("_t", encodedText);
        request.getContentType().setValue("text/plain");

        request.reset();
    }

    @Test
    public void [MethodUnderTest]ToString() {
        String text = "hello world";
        TextNode node = new TextNode(text);

        assertEquals("Hello, world!", node.toString());
    }
}

class MockHttpServletRequest extends HttpServletRequest {

    private String _t;

    public String getParameter(String name) throws IOException {
        return _t;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        _t = "";
    }

}