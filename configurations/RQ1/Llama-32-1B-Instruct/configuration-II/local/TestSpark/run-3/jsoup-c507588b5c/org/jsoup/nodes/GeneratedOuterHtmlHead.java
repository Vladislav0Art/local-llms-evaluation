package org.jsoup.nodes;

public class GeneratedOuterHtmlHead {

    private Document document;
    private Appendable accum;

    @Before
    public void setup() throws IOException {
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        document.appendChild(document.createTextNode(""));
        document.getDocumentElement().setAttribute("id", "root");
    }

    @Test
    public void outerHtmlHead() throws IOException {
        Document document = document;
        String htmlString = "<root><text>Hello World</text></root>";
        Appendable result = new StringBuilder();
        document.outerHtmlHead(result, 0, Document.OutputSettings.INDENT, true);
        assertEquals("<root>\n<text>Hello World</text>\n</root>", result.toString());
    }

}