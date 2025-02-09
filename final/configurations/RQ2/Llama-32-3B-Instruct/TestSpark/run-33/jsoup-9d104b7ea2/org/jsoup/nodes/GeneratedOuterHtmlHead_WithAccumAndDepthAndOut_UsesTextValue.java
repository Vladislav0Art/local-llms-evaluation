package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_WithAccumAndDepthAndOut_UsesTextValue {

    @Test
    public void outerHtmlHead_WithAccumAndDepthAndOut_UsesTextValue() throws IOException {
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();
        TextNode node = new TextNode("Hello");
        node.outerHtmlHead(accum, 1, out);
        assertEquals("<p>Hello</p>", accum.toString());
    }

}