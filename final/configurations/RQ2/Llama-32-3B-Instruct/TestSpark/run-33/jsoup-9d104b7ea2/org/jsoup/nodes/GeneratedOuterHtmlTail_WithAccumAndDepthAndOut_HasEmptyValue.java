package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_WithAccumAndDepthAndOut_HasEmptyValue {

    @Test
    public void outerHtmlTail_WithAccumAndDepthAndOut_HasEmptyValue() throws IOException {
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();
        TextNode node = new TextNode("");
        node.outerHtmlTail(accum, 1, out);
        assertEquals("", accum.toString());
    }

}