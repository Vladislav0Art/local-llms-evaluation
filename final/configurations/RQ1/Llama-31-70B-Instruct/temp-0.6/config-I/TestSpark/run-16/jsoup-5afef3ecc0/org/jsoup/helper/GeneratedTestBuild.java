package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GeneratedTestBuild {

    @Test
    public void testBuild() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://www.example.com/path?a=1&b=2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals("https://www.example.com/path?a=1&b=2", outputUrl.toString());
    }

}