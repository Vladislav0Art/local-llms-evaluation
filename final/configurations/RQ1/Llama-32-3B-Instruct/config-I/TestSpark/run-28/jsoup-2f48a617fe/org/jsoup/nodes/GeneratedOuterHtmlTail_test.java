package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

public class GeneratedOuterHtmlTail_test {

    @Test
    public void outerHtmlTail_test() throws Exception {
        Document doc = Document.parse("<html><head></head><body>some data</body></html>");
        String out = "output";
        Elements elements = doc.body().select("body");
        for (Element element : elements) {
            element.outerHtml("", out);
        }
        assertEquals("<html><head></head><body>some data</body></html>", doc.html());
    }

}