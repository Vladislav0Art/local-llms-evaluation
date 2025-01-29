package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseStringHrefNoLinkAtStart {

    @Test
    public void parseStringHrefNoLinkAtStart() {
        String html = "<body><a href='https://www.google.com'>Google</a></body>";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(0, document.getElementsByTagName("a").length);
        assertEquals(1, document.getElementsByClassName("href"));
    }

}