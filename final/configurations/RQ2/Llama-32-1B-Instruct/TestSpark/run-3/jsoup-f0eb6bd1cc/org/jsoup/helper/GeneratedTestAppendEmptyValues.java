package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class GeneratedTestAppendEmptyValues {

    public static String build(String url) {
        return new URI(url).toString();
    }

    @Test
    public void testAppendEmptyValues() throws URISyntaxException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        String key = "key";
        urlBuilder.appendKeyVal(3);
        urlBuilder.appendQueryParameter("", "");
        assertEquals(key + "=", urlBuilder.appendKeyVal("").toString());
    }

}