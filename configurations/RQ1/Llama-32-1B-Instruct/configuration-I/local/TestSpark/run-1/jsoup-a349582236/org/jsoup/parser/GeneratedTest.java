package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    public static Document selectElement(String html, String tag) {
        Document doc = Jsoup.parse(html);
        Elements elements = doc.select(tag);
        return doc;
    }

}