package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedNamespaceAware {

    @Test
    public void namespaceAware() throws Exception {
        Document doc = Jsoup.parse("html, body");
        System.out.println(doc.namespaceAware());
    }

}