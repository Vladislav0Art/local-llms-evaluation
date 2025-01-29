package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestNone {

    private Document document;

    @Before
    public void setup() {
        String html = "<html><body>Hello <a href=\"#\">world</a></body></html>";
        document = new Document();
        Element body = document.createElement("body");
        body.appendChild(document.createNode(document, lowerCase(html)));
    }

    @After
    public void tearDown() {
        // Remove the temporary HTML to avoid file corruption issues
        document.getElementById("test").remove();
    }

    private String lowerCase(String str) {
        return str.toLowerCase();
    }

    @Test
    public void testNone() {
        Safelist none = new Safelist(new String[]{"href"});
        Document document = Jsoup.parse("<html><body>Hello <a href=\"\" id=\"test\"></a></body></html>");
        assertnone.containsAll(document.select("a"));
    }

}