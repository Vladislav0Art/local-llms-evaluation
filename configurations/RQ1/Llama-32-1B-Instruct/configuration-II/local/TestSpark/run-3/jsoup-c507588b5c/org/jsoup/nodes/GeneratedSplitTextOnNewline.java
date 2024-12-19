package org.jsoup.nodes;

public class GeneratedSplitTextOnNewline {

    private Document document;
    private Appendable accum;

    @Before
    public void setup() throws IOException {
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        document.appendChild(document.createTextNode(""));
        document.getDocumentElement().setAttribute("id", "root");
    }

    @Test
    public void splitTextOnNewline() {
        TextNode text = new TextNode(document.getDocumentElement().getTextContent());
        int offset = 7; // replace with a valid offset value
        String expectedText = "Hello World";
        Appendable result = new StringBuilder();
        Document document = document;
        Document.OutputSettings out = Document.OutputSettings.INDENT;
        text.splitText(offset);
        assertEquals(expectedText, new String(result.toString().getBytes()));
    }

}