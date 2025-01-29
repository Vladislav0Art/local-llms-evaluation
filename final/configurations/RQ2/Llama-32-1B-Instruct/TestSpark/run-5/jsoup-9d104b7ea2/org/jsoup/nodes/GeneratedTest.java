package org.jsoup.nodes;

public class GeneratedTest {

    private static MockHttpServletRequest request;

    @Before
    public void setup() {
        String encodedText = "{\"hello:world\"";
        request = new MockHttpServletRequest();
        request.setMethod("POST");
        request.getParameterMap().put("_t", encodedText);
        request.getContentType().setValue("text/plain");

        request.reset();
    }

    @Test
    public void [MethodUnderTest]

    Test() throws IOException {
        String text = request.getParameter("text").toString();
        TextNode node = new TextNode(text);

        assertEquals("hello world", node.text());
    }

    @Test
    public void [MethodUnderTest]

    Blank() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());

        text = "hello";
        node = new TextNode(text);
        assertFalse(node.isBlank());
    }

    @Test
    public void [MethodUnderTest]

    SplitText() throws IOException {
        String text = "hello world";
        int offset = 5;
        TextNode node = new TextNode(text);

        assertEquals("world", node.splitText(offset).text());

        offset = -10;
        node = new TextNode(text);
        assertEquals("", node.splitText(offset));
    }

    @Test
    public void [MethodUnderTest]

    ToString() {
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