package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedOuterHtml_returnsOuterHTMLContent {

    @Test
    public void outerHtml_returnsOuterHTMLContent() {
        String htmlContent = "<html>Example HTML Content</html>";
        Document document = Jsoup.parse(htmlContent, "UTF-8", null);
        assertEquals(htmlContent, document.outerHtml());
    }

}