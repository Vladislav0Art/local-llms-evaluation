package org.jsoup.nodes;

public class GeneratedTestSplitText {

    private static final String TEST_TEXT = "<p>Hello World!</p>";

    @Test
    public void testSplitText() throws Exception {
        Document document = documentBuilder().createDocument();
        node = document.appendChild(documentBuilderFactory.createDocumentBuilder().newDocument()).appendChild(documentBuilderFactory.createDocumentBuilder().newDocumentFragment()).appendChild(documentBuilderFactory.createDocumentBuilder().newDocumentFragment()).appendChild(node);

        int offset = 6;
        TextNode child1 = (TextNode) node.splitText(offset);
        TextNode child2 = (TextNode) node.splitText(offset + 5);

        assertTrue(child1.text().equals(TEST_TEXT.substring(0, offset)));
        assertTrue(child2.text().equals(TEST_TEXT.substring(offset + 5, TEST_TEXT.length())));
    }

}