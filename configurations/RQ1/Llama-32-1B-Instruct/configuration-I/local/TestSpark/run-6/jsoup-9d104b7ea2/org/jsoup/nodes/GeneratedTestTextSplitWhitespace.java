package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedTestTextSplitWhitespace {

    @Mock
    private Document document;

    @Test
    public void testTextSplitWhitespace() throws Exception {
        Document doc = new Document();
        for (int i = 0; i < 10; i++) {
            Node node = doc.createElement("p");
            node.setText("   Hello  world!  ");
            doc.appendChild(node);
        }
        String text = "   Hello  world!";
        TextNode node = Mockito.mock(TextNode.class);
        when(node.getText()).thenReturn(text);

        TextNode result1 = TestUtils.splitText(2, node);

        Node sibling1 = result1.getSibling();
        Node nextSibling2 = parentNode.getNextSibling();

        if (nextSibling2 != null && !sibling1.equals(nextSibling2)) {
            throw new AssertionError("Wrong sibling for second split");
        }

        Node previousSibling3 = parentNode.getPreviousSibling();
        node.setText("");
        TextNode result4 = TestUtils.splitText(2, node);

        Node sibling5 = result4.getSibling();

        if (sibling5 != null && !previousSibling3.equals(sibling5)) {
            throw new AssertionError("Wrong sibling for second split");
        }
    }

}