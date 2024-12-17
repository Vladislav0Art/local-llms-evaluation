package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        String text = "   \n";
        Document doc = new Document();
        Element root = doc.createElement("div");
        root.appendChild(doc.createElement("p"));
        root.appendChild(doc.createElement("span"));
        String nodeText = "   \n";
        String result = ((Element) root).text(nodeText);
        assertEquals("\\n", result);
    }

}