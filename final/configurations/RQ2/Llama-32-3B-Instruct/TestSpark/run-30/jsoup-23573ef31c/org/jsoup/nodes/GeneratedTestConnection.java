package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedTestConnection {

    @Test
    public void testConnection() throws Exception {
        Parser parser = new Parser();
        Document document = parser.parse("https://www.example.com", "UTF-8");
        System.out.println(document.title());
    }
}

}