package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_DoesNotIndentIfNextSiblingIsBlank {

    @Test
    public void outerHtmlHead_DoesNotIndentIfNextSiblingIsBlank() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true);
        TextNode textNode = new TextNode("   ");
        textNode.parentNode = document;
        textNode.indent(accum, depth, out);
    }

}