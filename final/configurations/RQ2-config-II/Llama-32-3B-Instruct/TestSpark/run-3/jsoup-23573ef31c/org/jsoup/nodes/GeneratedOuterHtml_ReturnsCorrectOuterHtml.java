package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedOuterHtml_ReturnsCorrectOuterHtml {

    @Test
    public void outerHtml_ReturnsCorrectOuterHtml() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Jsoup.parse(html);
        assertEquals(html, document.outerHtml());
    }

}