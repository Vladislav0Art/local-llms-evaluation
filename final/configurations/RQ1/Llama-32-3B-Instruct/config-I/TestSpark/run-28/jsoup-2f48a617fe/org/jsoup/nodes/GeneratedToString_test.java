package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

public class GeneratedToString_test {

    @Test
    public void toString_test() throws Exception {
        Document doc = Document.parse("<html><body>some data</body></html>");
        String out = "output";
        Elements elements = doc.body().select("body");
        for (Element element : elements) {
            assertEquals("", element.toString());
        }
        assertEquals("<html><body>some data</body></html>", doc.html());
    }

}