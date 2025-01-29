package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class GeneratedTestBuildUrls {

    public static String build(String url) {
        return new URI(url).toString();
    }

    @Test
    public void testBuildUrls() throws URISyntaxException {
        Document doc = Jsoup.parse("http://example.com");
        String expectedUrl = "http://example.com";
        assertEquals(expectedUrl, build(doc.toString()));
    }

}