package org.jsoup.nodes;

public class GeneratedTest {

    private Document document;
    private Appendable accum;

    @Before
    public void setup() throws IOException {
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        document.appendChild(document.createTextNode(""));
        document.getDocumentElement().setAttribute("id", "root");
    }

    @Test
    public void isBlank() {
        TextNode text = new TextNode(document.getDocumentElement().getTextContent());
        assertEquals(false, text.isBlank());
        text.setText("");
        assertEquals(true, text.isBlank());
    }

    @Test
    public void outerHtmlHead() throws IOException {
        Document document = document;
        String htmlString = "<root><text>Hello World</text></root>";
        Appendable result = new StringBuilder();
        document.outerHtmlHead(result, 0, Document.OutputSettings.INDENT, true);
        assertEquals("<root>\n<text>Hello World</text>\n</root>", result.toString());
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

    @Test
    public void splitText() {
        TextNode text = new TextNode(document.getDocumentElement().getTextContent());
        int offset = 7; // replace with a valid offset value
        String expectedText = "Hello World";
        Appendable result = new StringBuilder();
        Document document = document;
        Document.OutputSettings out = Document.OutputSettings.INDENT;
        text.splitText(offset);
        assertEquals(expectedText, new String(result.toString().getBytes()));
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

    @Test
    public void isBlankAfterSplit() {
        TextNode text = new TextNode(document.getDocumentElement().getTextContent());
        int offset = 7; // replace with a valid offset value
        String expectedText = "Hello World";
        Appendable result = new StringBuilder();
        Document document = document;
        Document.OutputSettings out = Document.OutputSettings.INDENT;
        text.splitText(offset);
        assertEquals(false, text.isBlank());
    }

    @Test
    public void clone() {
        TextNode original = new TextNode(document.getDocumentElement().getTextContent());
        TextNode cloned = (TextNode) original.clone();
        assertEquals(original, cloned);
    }

}