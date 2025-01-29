package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseStringHrefAtEnd {

    @Test
    public void parseStringHrefAtEnd() {
        String html = "<html><body><a href='https://www.google.com'>Google</a></body><body></body>";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(1, document.getElementsByTagName("a").length);
        assertEquals(0, document.getElementsByClassName("href"));
    }

}