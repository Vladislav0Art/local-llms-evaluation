package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedNamespaceAwareWithBool {

    @Test
    public void namespaceAwareWithBool() throws Exception {
        Document doc = Jsoup.parse("<html><body></body></html>", "file:///path/to/file.html");
        W3CDom.W3CDom namespaceAware = new W3CDom();
        System.out.println(namespaceAware.namespaceAware(true));
    }

}