package org.jsoup.nodes;

public class GeneratedOuterHtmlTail {

    private Document document;
    private Appendable accum;

    @Before
    public void setup() throws IOException {
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        document.appendChild(document.createTextNode(""));
        document.getDocumentElement().setAttribute("id", "root");
    }

    @Test
    public void outerHtmlTail() {
        TextNode text = new TextNode(document.getDocumentElement().getTextContent());
        Appendable result = new StringBuilder();
        Document document = document;
        Document.OutputSettings out = Document.OutputSettings.INDENT;
        text.outerHtmlTail(result, 0, out);
        assertEquals("<root><text>Hello World</text></root>", result.toString());
    }

}