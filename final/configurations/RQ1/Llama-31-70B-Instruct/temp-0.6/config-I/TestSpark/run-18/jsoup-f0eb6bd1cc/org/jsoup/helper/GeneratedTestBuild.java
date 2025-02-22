package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.helper.UrlBuilder;

public class GeneratedTestBuild {

    @Test
    public void testBuild() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com:8080/path/to/file?key=value#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://xn--example-hva.com:8080/path/to/file?key=value#anchor");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}