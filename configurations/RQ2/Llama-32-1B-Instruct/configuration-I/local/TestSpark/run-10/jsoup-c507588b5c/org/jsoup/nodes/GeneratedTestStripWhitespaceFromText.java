package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestStripWhitespaceFromText {

    public static Document createNode(String name, String[] attributes) {
        return new Document();
    }

    @Test
    public void testStripWhitespaceFromText() {
        Document doc = createNode("div", new String[]{"text", "   Hello   "));
        Element element = (Element) doc.getElementById("test");
        String result3 = isBlank(element.text().trim());
        assertTrue(result3.equals(""));
	}

    }