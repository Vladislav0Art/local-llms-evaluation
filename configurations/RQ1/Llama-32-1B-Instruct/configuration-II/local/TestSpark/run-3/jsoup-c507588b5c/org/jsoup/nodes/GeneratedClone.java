package org.jsoup.nodes;

public class GeneratedClone {

    private Document document;
    private Appendable accum;

    @Before
    public void setup() throws IOException {
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        document.appendChild(document.createTextNode(""));
        document.getDocumentElement().setAttribute("id", "root");
    }

    @Test
    public void clone() {
        TextNode original = new TextNode(document.getDocumentElement().getTextContent());
        TextNode cloned = (TextNode) original.clone();
        assertEquals(original, cloned);
    }

}