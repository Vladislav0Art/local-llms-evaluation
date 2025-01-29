package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class GeneratedTestAppendKeyValWithMultipleElements {

    public static String build(String url) {
        return new URI(url).toString();
    }

    @Test
    public void testAppendKeyValWithMultipleElements() throws URISyntaxException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        String key1 = "key1";
        String key2 = "key2";
        urlBuilder.appendKeyVal(key1);
        urlBuilder.appendKeyVal(key2);
        assertEquals(key1 + "=" + key2, urlBuilder.appendKeyVal(key2).toString());
    }

}