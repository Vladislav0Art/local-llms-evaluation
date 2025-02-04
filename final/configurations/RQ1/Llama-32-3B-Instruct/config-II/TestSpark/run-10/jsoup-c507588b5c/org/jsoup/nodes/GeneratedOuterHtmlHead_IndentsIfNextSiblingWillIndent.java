package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_IndentsIfNextSiblingWillIndent {

    @Test
    public void outerHtmlHead_IndentsIfNextSiblingWillIndent() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true);
        TextNode textNode = new TextNode("text");
        textNode.parentNode = document;
        textNode.indent(accum, depth, out);
    }

}