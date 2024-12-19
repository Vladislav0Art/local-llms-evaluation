package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("test.html"));
        Appendable appendable = new StringBuilder();
        int depth = 0;
        OutputSettings out = new Document.OutputSettings();
        Node parentNode = null;

        TextNode node1 = new TextNode("<p>   </p>");
        node1.outerHtmlHead(appendable, depth, out);

        Assert.assertTrue(appendable.toString().contains("<span class=\"plain-text\">"));
    }

}