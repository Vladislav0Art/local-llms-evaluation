package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Document;

public class GeneratedTestTextContainsUPlus9 {

    @Test
    public void testTextContainsUPlus9() {
        String html = "<p>This is a paragraph of text containing \u0009newline characters.</p>";
        Document document = new Document();
        document.loadHTML(html);
        Node textNode = document.body().text();

        assertTrue(textNode.contains("\u0009"));
    }

}