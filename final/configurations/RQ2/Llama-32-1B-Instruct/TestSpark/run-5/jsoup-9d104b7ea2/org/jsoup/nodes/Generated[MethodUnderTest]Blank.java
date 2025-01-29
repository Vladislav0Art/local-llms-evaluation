package org.jsoup.nodes;

public class Generated[MethodUnderTest]

Blank {

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
    public void [MethodUnderTest]Blank() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());

        text = "hello";
        node = new TextNode(text);
        assertFalse(node.isBlank());
    }

}