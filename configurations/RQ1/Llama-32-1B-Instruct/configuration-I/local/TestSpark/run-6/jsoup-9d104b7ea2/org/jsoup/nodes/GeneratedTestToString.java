package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedTestToString {

    @Mock
    private Document document;

    @Test
    public void testToString() throws Exception {
        Document doc = new Document();
        Node node = doc.createElement("p");
        node.setText("<p>Hello, world!</p>");
        doc.appendChild(node);

        String text = "<p>Hello, world!</p>";
        TextNode result1 = TestUtils.toString(doc, node);
        assertEquals(text, result1.getText());
    }

}