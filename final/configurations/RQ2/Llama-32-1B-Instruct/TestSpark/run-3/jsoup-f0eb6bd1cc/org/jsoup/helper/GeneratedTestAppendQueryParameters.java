package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class GeneratedTestAppendQueryParameters {

    public static String build(String url) {
        return new URI(url).toString();
    }

    @Test
    public void testAppendQueryParameters() throws URISyntaxException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendQueryParameter("param1", "value1");
        urlBuilder.appendQueryParameter("param2", "value2");
        assertEquals(build("http://example.com?param1=value1&param2=value2"), urlBuilder.build());
    }

}