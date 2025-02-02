package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new StringReader("<p>Hello</p><span>World!</span></p>"));
        Appendable accum = new StringOutputStream();
        TextNode root = new TextNode("Hello World!");
        root.outerHtmlTail(accum, 0, Document.OutputSettings.PrettyPrint());
        assertEquals("<p>Hello <span>World!</span></p>", new String(accum.toString()));
    }

}