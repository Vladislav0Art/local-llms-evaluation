package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testBasicHtml() throws Exception {
        String html = "<html><body>Hello, World!</body></html>";
        Document document = Jsoup.parse(html);
        System.out.println(document.toString());
    }

    @Test
    public void testTraverseDom() throws Exception {
        String html = "<html><body><p>Paragraph 1</p><p>Paragraph 2</p></body></html>";
        Document document = Jsoup.parse(html);

        Element paragraph1 = document.select("p").first();
        System.out.println(paragraph1.text());

        Element pElement = document.select("p").first().select("a").first();
        if (pElement != null) {
            System.out.println(pElement.attr("href"));
        }
    }

    @Test
    public void testAppendElement() throws Exception {
        String html = "<html><body>Hello, World!</body></html>";
        Document document = Jsoup.parse(html);

        Element paragraph = document.select("body").first();
        paragraph.append("<p>Added paragraph</p>");

        System.out.println(paragraph.toString());
    }

    @Test
    public void testAppendCharacter() throws Exception {
        String html = "<html><body>Hello, World!</body></html>";
        Document document = Jsoup.parse(html);

        Element paragraph = document.select("body").first();
        paragraph.append("\u0001");

        System.out.println(paragraph.toString());
    }

    @Test
    public void testAppendString() throws Exception {
        String html = "<html><body>Hello, World!</body></html>";
        Document document = Jsoup.parse(html);

        Element paragraph = document.select("body").first();
        paragraph.append(" Added string");

        System.out.println(paragraph.toString());
    }

    @Test
    public void testPrintWriter() throws Exception {
        String html = "<html><body>Hello, World!</body></html>";
        Document document = Jsoup.parse(html);

        java.io.PrintWriter writer = new java.io.PrintWriter(System.out);
        writer.print(document.toString());
        writer.close();
    }

}