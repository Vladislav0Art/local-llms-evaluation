package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedOuterHtml_OuterHtmlReturnsEmptyString {

    @Test
    public void outerHtml_OuterHtmlReturnsEmptyString() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        assertEquals("", document.outerHtml());
    }

}