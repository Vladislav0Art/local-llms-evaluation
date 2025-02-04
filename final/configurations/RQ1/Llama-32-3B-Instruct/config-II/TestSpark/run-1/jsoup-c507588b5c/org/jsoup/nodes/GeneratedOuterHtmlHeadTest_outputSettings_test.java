package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadTest_outputSettings_test {

    @Test
    public void outerHtmlHeadTest_outputSettings_test() throws IOException {
        final Document document = Document.createDocument();
        final TextNode node = new TextNode("   ");
        final Appendable accum = new StringBuilder();
        final Document.OutputSettings out = new Document.OutputSettings(true);
        node.outerHtmlHead(accum, 0, out);
        Assert.assertTrue(accum.toString().contains("<br>"));
    }

}