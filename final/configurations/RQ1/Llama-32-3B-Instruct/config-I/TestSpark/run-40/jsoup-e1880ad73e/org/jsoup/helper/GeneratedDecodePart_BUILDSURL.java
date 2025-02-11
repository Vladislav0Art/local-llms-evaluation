package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedDecodePart_BUILDSURL {

    @Test
    public void decodePart_BUILDSURL() throws MalformedURLException, URISyntaxException {
        String url = "http%3A%2F%2Fexample.com%2F";
        URL parsedUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(parsedUrl);
        assertEquals("http://example.com/", (builder.u.getProtocol() + "://" + builder.u.getHost() + "/" + builder.u.getPath()).replaceAll("/$", ""));
    }

}