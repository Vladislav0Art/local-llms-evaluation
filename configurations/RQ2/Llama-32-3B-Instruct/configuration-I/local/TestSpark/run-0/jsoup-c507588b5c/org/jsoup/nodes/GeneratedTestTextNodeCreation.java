package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestTextNodeCreation {

    @Test
    public void testTextNodeCreation() throws Exception {
        String html = "<html><body>This is a <span>test</span> text.</body></html>";
        Document soup = Jsoup.parse(html);
        TextNode clone = new TextNode(soup.body().text());
        assertTrue(clone.isBlank());
        assertFalse(clone.isBlank());
    }

}