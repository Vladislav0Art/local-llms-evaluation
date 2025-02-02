package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new StringReader("<p>Hello</p><span>World!</span></p>"));
        Appendable accum = new StringOutputStream();
        TextNode root = new TextNode("Hello World!");
        root.outerHtmlHead(accum, 0, Document.OutputSettings.PrettyPrint());
        assertEquals("<p>Hello <span>World!</span></p>", new String(accum.toString()));
    }

}