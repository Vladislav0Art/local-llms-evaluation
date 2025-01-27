package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.Test;

public class GeneratedTestWhenInputUrl {

    @org.junit.Before
    public void setup() {
        connection = new Connection();
        urlBuilder = new UrlBuilder();
        urlBuilder.setConnection(connection);
        inputUrl = new URL("https://example.com");
    }

    private Connection connection;
    private UrlBuilder urlBuilder;
    private URL inputUrl;

    @Test
    public void testWhenInputUrl() {
        org.jsoup.helper.TestUtils.when(urlBuilder.build()).thenReturn(inputUrl.toURI());
    }

}