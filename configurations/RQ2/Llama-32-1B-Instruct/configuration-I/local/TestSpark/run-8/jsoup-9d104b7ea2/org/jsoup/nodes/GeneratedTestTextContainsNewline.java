package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Document;

public class GeneratedTestTextContainsNewline {

    @Test
    public void testTextContainsNewline() {
        String html = "<p>This is a paragraph of text containing <br>newline characters.</p>";
        Document document = new Document();
        document.loadHTML(html);
        Node textNode = document.body().text();

        assertTrue(textNode.contains("\n"));
    }

}