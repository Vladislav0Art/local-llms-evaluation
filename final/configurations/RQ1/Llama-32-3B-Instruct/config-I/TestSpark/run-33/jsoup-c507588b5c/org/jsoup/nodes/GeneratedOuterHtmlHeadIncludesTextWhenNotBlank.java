package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadIncludesTextWhenNotBlank {

    @Test
    public void outerHtmlHeadIncludesTextWhenNotBlank() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(false, true);
        TextNode node = new TextNode("   ");
        node.outerHtmlHead(accum, depth, out);
        assertEquals("<span>   </span>", accum.toString());
    }

}