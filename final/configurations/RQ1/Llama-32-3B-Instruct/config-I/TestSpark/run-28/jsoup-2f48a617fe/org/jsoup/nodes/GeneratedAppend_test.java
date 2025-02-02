package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

public class GeneratedAppend_test {

    @Test
    public void append_test() throws Exception {
        Document doc = Document.parse("<html><body>some data</body></html>");
        Elements elements = new Elements();
        elements.append("");
        assertEquals("", elements.toString());
        doc.body().append(elements);
        assertEquals("<html><body>some data</body></html>", doc.html());
    }
}

class OutputSettings {
    public void append(String str) {
    }

}