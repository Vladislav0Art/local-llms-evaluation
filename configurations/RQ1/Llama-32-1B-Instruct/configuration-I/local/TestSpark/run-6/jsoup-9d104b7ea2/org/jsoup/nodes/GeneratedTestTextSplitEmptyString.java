package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedTestTextSplitEmptyString {

    @Mock
    private Document document;

    @Test
    public void testTextSplitEmptyString() throws Exception {
        Document doc = new Document();
        for (int i = 0; i < 10; i++) {
            Node node = doc.createElement("p");
            node.setText("");
            doc.appendChild(node);
        }
        String text = "";
        TextNode node = Mockito.mock(TextNode.class);
        when(node.getText()).thenReturn(text);

        TextNode result1 = TestUtils.splitText(5, node);
        Node sibling1 = result1.getSibling();
        Node nextSibling2 = parentNode.getNextSibling();

        if (nextSibling2 != null) {
            assertEquals(sibling1, nextSibling2);
        }

        node.setText("");
        TextNode result2 = TestUtils.splitText(5, node);

        TextNode result3 = TestUtils.splitText(0, node);
        Node sibling4 = result3.getSibling();
        Node nextSibling5 = parentNode.getNextSibling();

        if (nextSibling5 != null) {
            assertEquals(sibling4, nextSibling5);
        }
    }

}