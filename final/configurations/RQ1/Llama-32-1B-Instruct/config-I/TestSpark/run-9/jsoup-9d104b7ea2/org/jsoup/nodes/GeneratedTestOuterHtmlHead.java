package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Document doc = new Document();
        Appendable accum = new StringBuilder();
        Assert.assertTrue(TextNode.outerHtmlHead(accum, 1, null).equals(doc.outerHtml()));
    }

}