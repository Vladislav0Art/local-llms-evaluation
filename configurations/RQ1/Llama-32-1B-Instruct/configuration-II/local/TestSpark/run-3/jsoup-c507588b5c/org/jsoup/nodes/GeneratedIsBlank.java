package org.jsoup.nodes;

public class GeneratedIsBlank {

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

}