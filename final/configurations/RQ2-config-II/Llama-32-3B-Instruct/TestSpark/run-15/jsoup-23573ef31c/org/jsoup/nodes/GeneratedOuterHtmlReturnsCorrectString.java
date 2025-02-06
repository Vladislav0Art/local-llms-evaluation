package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.Document;
import org.mockito.Mockito;

public class GeneratedOuterHtmlReturnsCorrectString {

    @Test
    public void outerHtmlReturnsCorrectString() {
        String html = "<html><body>Hello World!</body></html>";
        Connection connection = Jsoup.connect(html);
        Document document = connection.get();
        assertEquals("<html><body>Hello World!</body></html>", document.outerHtml());
    }

}