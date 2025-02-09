package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_WithAccumAndDepthAndOut_ThrowsIOException {

    @Test
    public void outerHtmlTail_WithAccumAndDepthAndOut_ThrowsIOException() throws IOException {
        Appendable accum = new StringBuilder();
        TextNode node = new TextNode("");
        StringWriter out = new StringWriter();

        assertThrows(IOException.class, () -> node.outerHtmlTail(accum, 1, out));
    }

}