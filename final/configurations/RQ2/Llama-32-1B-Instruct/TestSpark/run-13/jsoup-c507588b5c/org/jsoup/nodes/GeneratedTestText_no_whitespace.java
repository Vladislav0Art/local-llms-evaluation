package org.jsoup.nodes;

public class GeneratedTestText_no_whitespace {

    private Appendable mockAppendable;
    private Document mockDocument;

    @Test
    public void testText_no_whitespace() {
        String text = "HelloWorld!";
        TextNode node = new TextNode(text);
        assertEquals("Hello World!", node.text());
    }

    @BeforeClass
    public static void setupMock() {
        mockAppendable = new StringReader("");
        mockDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(mockAppendable.toString());
    }

}