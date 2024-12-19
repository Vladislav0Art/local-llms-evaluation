package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() {
        String text = "abc";
        Document doc = new Document();
        Element root = doc.createElement("div");
        root.appendChild(doc.createElement("p"));
        root.appendChild(doc.createElement("span"));
        String nodeText = "abc";
        boolean result = ((Element) root).lastCharIsWhitespace(nodeText);
        assertTrue(result);
    }

}