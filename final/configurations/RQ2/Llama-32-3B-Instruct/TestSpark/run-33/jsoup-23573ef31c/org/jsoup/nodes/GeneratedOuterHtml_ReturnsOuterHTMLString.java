package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedOuterHtml_ReturnsOuterHTMLString {

    @Test
    public void outerHtml_ReturnsOuterHTMLString() {
        Connection connection = Jsoup.connect("https://www.example.com");
        Document document = new Document(connection.url());
        String outerHtml = document.outerHtml();
        assertNotNull(outerHtml);
    }

}