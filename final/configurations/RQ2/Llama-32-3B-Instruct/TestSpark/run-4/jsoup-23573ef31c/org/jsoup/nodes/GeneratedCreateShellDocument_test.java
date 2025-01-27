package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedCreateShellDocument_test {

    @Test
    public void createShellDocument_test() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = new Document();
        document.appendConnection(connection);
        assertNotNull(document);
    }

}