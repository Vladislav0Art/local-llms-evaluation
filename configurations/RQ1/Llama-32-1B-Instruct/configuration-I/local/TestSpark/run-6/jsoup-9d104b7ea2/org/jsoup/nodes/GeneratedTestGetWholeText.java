package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedTestGetWholeText {

    @Mock
    private Document document;

    @Test
    public void testGetWholeText() throws Exception {
        Document doc = new Document();
        Node node = doc.createElement("p");
        node.setText("Hello, world!");
        doc.appendChild(node);

        String text = "Hello, world!";
        TextNode result1 = TestUtils.getWholeText(node);
        assertEquals(text, result1.getText());
    }

}