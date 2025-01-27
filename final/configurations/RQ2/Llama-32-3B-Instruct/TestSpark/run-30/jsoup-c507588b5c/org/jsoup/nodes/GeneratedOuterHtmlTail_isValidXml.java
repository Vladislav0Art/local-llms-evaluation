package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_isValidXml {

    @Test
    public void outerHtmlTail_isValidXml() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode("text");
        node.outerHtmlTail(accum, 0, out);
        String xml = accum.toString();
        Assert.assertTrue(xml.contains("</p>"));
    }

}