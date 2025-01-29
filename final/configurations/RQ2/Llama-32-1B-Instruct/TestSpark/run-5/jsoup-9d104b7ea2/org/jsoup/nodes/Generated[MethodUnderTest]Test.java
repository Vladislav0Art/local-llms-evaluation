package org.jsoup.nodes;

public class Generated[MethodUnderTest]

Test {

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
    public void [MethodUnderTest]Test() throws IOException {
        String text = request.getParameter("text").toString();
        TextNode node = new TextNode(text);

        assertEquals("hello world", node.text());
    }

}