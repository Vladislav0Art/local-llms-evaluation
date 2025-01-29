package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class GeneratedTestAppendEmptyQueryParameters {

    public static String build(String url) {
        return new URI(url).toString();
    }

    @Test
    public void testAppendEmptyQueryParameters() throws URISyntaxException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendKeyVal(3);
        urlBuilder.appendQueryParameter("", "value1");
        assertEquals(build("http://example.com?param=value1"), urlBuilder.build());
    }

}