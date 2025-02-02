package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

public class GeneratedAsXmlDeclaration_test {

    @Test
    public void asXmlDeclaration_test() throws Exception {
        Document doc = Document.parse("<html><head></head><body>some data</body></html>");
        String out = "output";
        Elements elements = doc.head().select("head");
        for (Element element : elements) {
            assertEquals("", element.asXmlDeclaration());
        }
        assertEquals("<html><head></head><body>some data</body></html>", doc.html());
    }

}