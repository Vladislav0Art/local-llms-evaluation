package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestIsSafeAttributeAndAttributes {

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
    public void testIsSafeAttributeAndAttributes() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"\" id=\"test\" class=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

    private void assertsafesafe(Safelist safelist, String... attribute) {
        Document document = Jsoup.parse("<html><body>Hello <a href=\"#\" id=\"test\"></a></body></html>");
        for (String a : attribute) {
            assert safelist.containsAll(document.select(a));
        }
    }

    private void testIsSafeTag() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"#\" id=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

    private void testIsSafeAttribute() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"\" id=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

    private void testIsSafeTagAndAttribute() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"#\" id=\"test\" class=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

    private void testIsSafeAttributeAndAttribute() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"\" id=\"test\" class=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

    private void testIsSafeTagAndAttributes() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"#\" id=\"test\" class=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

    private void testIsSafeAttributeAndAttributes() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"\" id=\"test\" class=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

    private void testIsSafeTagAndAttribute() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"#\" id=\"test\" class=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

    private void testIsSafeAttributeAndAttributes() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"\" id=\"test\" class=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

    private void testIsSafeTagAndAttributes() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"#\" id=\"test\" class=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

    private void testIsSafeAttributeAndAttributes() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"\" id=\"test\" class=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

    private void testIsSafeTagAndAttributes() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"#\" id=\"test\" class=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

    private void testIsSafeAttributeAndAttributes() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"\" id=\"test\" class=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

    private void testIsSafeTagAndAttributes() {
        Safelist safelist = new Safelist();
        Document document = Jsoup.parse("<html><body>Hello <a href=\"#\" id=\"test\" class=\"test\"></a></body></html>");
        assertsafesafe(safelist, "class", false);
        assertsafesafe(safelist, "src", true);
    }

}