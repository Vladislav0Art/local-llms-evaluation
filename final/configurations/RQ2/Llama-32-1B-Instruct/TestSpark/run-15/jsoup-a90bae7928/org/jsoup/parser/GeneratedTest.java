package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void parseString() {
        String html = "<html><body><a href='https://www.google.com'>Google</a></body></html>";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(1, document.getElementsByTagName("a").length);
        assertEquals(0, document.getElementsByClassName("href"));
    }

    @Test
    public void parseStringHref() {
        String html = "<html><body><a href='https://www.google.com'>Google</a></body></html>";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(1, document.getElementsByTagName("a").length);
        assertEquals(0, document.getElementsByClassName("href"));
    }

    @Test
    public void parseStringHrefNoLink() {
        String html = "<html><body><a href='https://www.google.com'>Google</a></body></html>";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(1, document.getElementsByTagName("a").length);
        assertEquals(0, document.getElementsByClassName("href"));
    }

    @Test
    public void parseStringHrefNoLinkAtEnd() {
        String html = "<html><body><a href='https://www.google.com'>Google</a></body></html>";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(1, document.getElementsByTagName("a").length);
        assertEquals(0, document.getElementsByClassName("href"));
    }

    @Test
    public void parseStringHrefNoLinkAtStart() {
        String html = "<body><a href='https://www.google.com'>Google</a></body>";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(0, document.getElementsByTagName("a").length);
        assertEquals(1, document.getElementsByClassName("href"));
    }

    @Test
    public void parseStringHrefNoLinkAtMiddle() {
        String html = "<body><a href='https://www.google.com'>Google</a> another link here";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(1, document.getElementsByTagName("a").length);
        assertEquals(0, document.getElementsByClassName("href"));
    }

    @Test
    public void parseStringHrefNoLinkAtEndMiddle() {
        String html = "<body><a href='https://www.google.com'>Google</a> another link here</body>";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(1, document.getElementsByTagName("a").length);
        assertEquals(0, document.getElementsByClassName("href"));
    }

    @Test
    public void parseStringHrefAtEnd() {
        String html = "<html><body><a href='https://www.google.com'>Google</a></body><body></body>";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(1, document.getElementsByTagName("a").length);
        assertEquals(0, document.getElementsByClassName("href"));
    }

    @Test
    public void parseStringHrefAtStart() {
        String html = "<html><body><body><a href='https://www.google.com'>Google</a></body></body>";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(1, document.getElementsByTagName("a").length);
        assertEquals(0, document.getElementsByClassName("href"));
    }

    @Test
    public void parseStringHrefAtMiddle() {
        String html = "<html><body><a href='https://www.google.com'>Google</a> another link here";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(1, document.getElementsByTagName("a").length);
        assertEquals(0, document.getElementsByClassName("href"));
    }

}