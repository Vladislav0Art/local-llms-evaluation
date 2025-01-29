package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseStringHref {

    @Test
    public void parseStringHref() {
        String html = "<html><body><a href='https://www.google.com'>Google</a></body></html>";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(1, document.getElementsByTagName("a").length);
        assertEquals(0, document.getElementsByClassName("href"));
    }

}