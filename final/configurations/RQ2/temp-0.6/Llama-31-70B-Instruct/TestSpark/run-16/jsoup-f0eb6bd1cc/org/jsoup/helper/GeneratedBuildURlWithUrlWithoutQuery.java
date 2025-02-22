package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildURlWithUrlWithoutQuery {

    @Test
    public void buildURlWithUrlWithoutQuery() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("https://www.example.com", builtUrl.toString());
    }

}