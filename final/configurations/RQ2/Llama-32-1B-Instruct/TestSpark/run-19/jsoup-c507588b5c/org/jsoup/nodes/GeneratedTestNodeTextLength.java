package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestNodeTextLength {

    public static Document createMockDocument() {
        return new Document();
    }

    @Test
    public void testNodeTextLength() {
        Document document = createMockDocument();
        Element node = newElement(document);
        String result1 = (String) node.text().replaceAll("\\n", "");
        int length = Integer.parseInt(result1.splitText(0).getWholeText().length());
        assertEquals(3, length);
    }

}