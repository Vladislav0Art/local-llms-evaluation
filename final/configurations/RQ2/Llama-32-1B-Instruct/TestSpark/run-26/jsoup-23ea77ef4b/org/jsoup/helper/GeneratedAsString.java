package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedAsString {

    @Test
    public void asString() throws Exception {
        Document doc = Jsoup.parse("<html><body>Hello, World!</body></html>", "file:///path/to/file.html");
        java.util.StringBuilder string = new java.util.StringBuilder();
        W3CDom.asString(doc, string);
        System.out.println(string.toString());
    }

}