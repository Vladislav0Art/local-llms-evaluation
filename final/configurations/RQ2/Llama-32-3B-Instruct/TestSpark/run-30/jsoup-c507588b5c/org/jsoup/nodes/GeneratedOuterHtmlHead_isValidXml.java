package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_isValidXml {

    @Test
    public void outerHtmlHead_isValidXml() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode("text");
        node.outerHtmlHead(accum, 0, out);
        String xml = accum.toString();
        Assert.assertTrue(xml.contains("<p>text</p>"));
    }

}