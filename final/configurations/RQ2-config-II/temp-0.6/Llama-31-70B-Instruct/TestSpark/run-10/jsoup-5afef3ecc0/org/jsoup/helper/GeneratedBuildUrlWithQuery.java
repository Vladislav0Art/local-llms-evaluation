package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlWithQuery {

    private URL url;

    @Before
    public void setup() throws MalformedURLException {
        url = new URL("https://www.example.com/");
    }

    @Test
    public void buildUrlWithQuery() throws MalformedURLException {
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        builder.appendKeyVal(new Connection.KeyVal("key2", "value2"));
        URL normalizedUrl = builder.build();
        assertEquals("https://www.example.com/?key1=value1&key2=value2", normalizedUrl.toString());
    }

}