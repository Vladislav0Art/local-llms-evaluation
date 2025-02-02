package org.jsoup.nodes;

public class GeneratedOuterHtmlTailDoesNotOutputAnyThing {

    @Test
    public void outerHtmlTailDoesNotOutputAnyThing() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, true);
        TextNode textNode = new TextNode("");
        try {
            textNode.outerHtmlTail(accum, 0, out);
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

}