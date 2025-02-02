package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadDoesNotIncludeTextWhenBlank {

    @Test
    public void outerHtmlHeadDoesNotIncludeTextWhenBlank() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(false, true);
        TextNode node = new TextNode("");
        node.outerHtmlHead(accum, depth, out);
        assertEquals("", accum.toString());
    }

}