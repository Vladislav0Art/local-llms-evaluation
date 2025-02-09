package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedParseDocParseCorrectly {

    @Test
    public void parseDocParseCorrectly() throws IOException {
        Document document = Jsoup.parse("<a>1<a><span>2</span></a><a>3</a>");
        assertEquals(4, document.childNodes().size());
    }
}

}