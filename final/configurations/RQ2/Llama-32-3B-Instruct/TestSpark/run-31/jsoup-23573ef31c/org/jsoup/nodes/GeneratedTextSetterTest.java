package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() throws IOException {
        String html = "<html><body>Hello <span>World!</span></body></html>";
        Document document = Jsoup.parse(html).documentElement();
        Document parsedDoc = Jsoup.parse(document.outerHtml()).documentElement();
        assertEquals("Hello World!", parsedDoc.text());
    }

}