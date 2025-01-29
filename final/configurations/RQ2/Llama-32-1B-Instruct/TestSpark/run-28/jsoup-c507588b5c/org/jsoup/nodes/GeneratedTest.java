package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    public static String getWholeText(String html) {
        Document doc = Jsoup.parse(html);
        return doc.body().text();
    }

    public static boolean isBlank(String html) {
        return html.trim().isEmpty();
    }

}