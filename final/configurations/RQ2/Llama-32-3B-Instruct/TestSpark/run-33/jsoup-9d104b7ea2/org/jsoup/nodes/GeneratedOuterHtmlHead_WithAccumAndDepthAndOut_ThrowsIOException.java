package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_WithAccumAndDepthAndOut_ThrowsIOException {

    @Test
    public void outerHtmlHead_WithAccumAndDepthAndOut_ThrowsIOException() throws IOException {
        Appendable accum = new StringBuilder();
        TextNode node = new TextNode("Hello");
        StringWriter out = new StringWriter();

        assertThrows(IOException.class, () -> node.outerHtmlHead(accum, 1, out));
    }

}