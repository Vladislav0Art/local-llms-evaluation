package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("test.html"));
        Appendable appendable = new StringBuilder();
        int depth = 0;
        OutputSettings out = new Document.OutputSettings();

        TextNode node1 = new TextNode("<p>   </p>");
        node1.outerHtmlTail(appendable, depth, out);

        Assert.assertFalse(appendable.toString().contains("  "));
    }

}