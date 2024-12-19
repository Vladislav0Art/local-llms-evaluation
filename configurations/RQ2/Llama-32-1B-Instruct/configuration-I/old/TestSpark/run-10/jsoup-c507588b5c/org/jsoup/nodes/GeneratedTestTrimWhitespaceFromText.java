package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestTrimWhitespaceFromText {

    public static Document createNode(String name, String[] attributes) {
        return new Document();
    }

    @Test
    public void testTrimWhitespaceFromText() {
        Document doc = createNode("div", new String[]{"text", "Hello World  "));
        Element element = (Element) doc.getElementById("test");
        String result4 = isBlank(element.text().trim());
        assertTrue(result4.equals(""));
	}

    }