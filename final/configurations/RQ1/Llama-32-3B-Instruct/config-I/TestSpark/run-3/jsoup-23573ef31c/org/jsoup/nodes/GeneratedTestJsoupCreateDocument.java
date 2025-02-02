package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestJsoupCreateDocument {

    @Test
    public void testJsoupCreateDocument() {
        String html = "<html>content</html>";
        Document document = Document.createDocument(html, null);
        assert document != null;
    }

}