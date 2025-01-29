package org.jsoup.nodes;

public class Generated[MethodUnderTest]

SplitText {

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
    public void [MethodUnderTest]SplitText() throws IOException {
        String text = "hello world";
        int offset = 5;
        TextNode node = new TextNode(text);

        assertEquals("world", node.splitText(offset).text());

        offset = -10;
        node = new TextNode(text);
        assertEquals("", node.splitText(offset));
    }

}