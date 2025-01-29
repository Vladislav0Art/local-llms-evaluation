package org.jsoup.nodes;

public class GeneratedTestSplitText {

    private LeafNode leafNode;

    @Before
    public void setup() throws IOException {
        Document document = new Document();
        Appendable appendable = document.append("Hello World!");
        leafNode = TextNode.createFromEncoded(toString(appendable));
    }

    @Test
    public void testSplitText() {
        String text = "Hello";
        TextNode splitTextNode = (TextNode) leafNode.splitText(0);
        assertEquals("Hello", splitTextNode.text().trim());
    }

}