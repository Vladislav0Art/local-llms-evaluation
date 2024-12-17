package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedTestTextSplit {

    @Mock
    private Document document;

    @Test
    public void testTextSplit() throws Exception {
        Document doc = new Document();
        for (int i = 0; i < 5; i++) {
            Node node = doc.createElement("p");
            node.setText("");
            doc.appendChild(node);
        }
        String text = "Hello, world!";
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
        Node sibling3 = result2.getSibling();
        Node nextSibling4 = parentNode.getNextSibling();

        if (nextSibling4 != null && !sibling3.equals(nextSibling4)) {
            throw new AssertionError("Wrong sibling for second split");
        }
    }

}