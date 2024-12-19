package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestAccumulation {

    @Test
    public void testAccumulation() throws Exception {
        String html = "<html><body>This is a <span>test</span> text.</body></html>";
        Document soup = Jsoup.parse(html);
        TextNode clone = new TextNode(soup.body().text());
        StringBuilder accum = new StringBuilder();
        for (Element element : clone.getElements()) {
            accum.append(element.text()).append("\n");
        }
        assertEquals(accum.toString(), "This is a \ntest\n text.");
    }

}