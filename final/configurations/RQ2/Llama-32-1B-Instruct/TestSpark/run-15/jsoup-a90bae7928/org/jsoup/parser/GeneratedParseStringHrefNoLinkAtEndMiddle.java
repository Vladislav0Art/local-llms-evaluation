package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseStringHrefNoLinkAtEndMiddle {

    @Test
    public void parseStringHrefNoLinkAtEndMiddle() {
        String html = "<body><a href='https://www.google.com'>Google</a> another link here</body>";
        HTMLParser parser = new HTMLParser();
        Node document = parser.parse(html);
        assertEquals(1, document.getElementsByTagName("a").length);
        assertEquals(0, document.getElementsByClassName("href"));
    }

}