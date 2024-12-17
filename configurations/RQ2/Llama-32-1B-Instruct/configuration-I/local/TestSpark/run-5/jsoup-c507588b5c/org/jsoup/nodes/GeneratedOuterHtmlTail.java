package org.jsoup.nodes;

public class GeneratedOuterHtmlTail {

    @Test
    public void outerHtmlTail() throws IOException {
        StringBuilder buffer = new StringBuilder();
        TextNode node = new TextNode("<p>Hello World</p>");
        String result = node.outerHtmlTail(buffer, 0, null);
        assertNotNull(result);
        assertEquals("<p>Hello World</p>", result.toString());
    }

}