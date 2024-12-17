package org.jsoup.nodes;

public class GeneratedOuterHtmlHead {

    @Test
    public void outerHtmlHead() throws IOException {
        StringBuilder buffer = new StringBuilder();
        TextNode node = new TextNode("<p>Hello World</p>");
        String result = node.outerHtmlHead(buffer, 0, null);
        assertNotNull(result);
        assertEquals("<p><script>alert('Hello World')</script></p>", result.toString());
    }

}