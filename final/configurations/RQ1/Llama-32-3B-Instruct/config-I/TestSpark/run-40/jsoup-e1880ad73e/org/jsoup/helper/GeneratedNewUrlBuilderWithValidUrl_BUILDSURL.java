package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedNewUrlBuilderWithValidUrl_BUILDSURL {

    @Test
    public void newUrlBuilderWithValidUrl_BUILDSURL() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?query#anchor";
        URL parsedUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(parsedUrl);
        assertEquals("http://example.com/path", (builder.u.getProtocol() + "://" + builder.u.getHost() + "/" + builder.u.getPath()).replaceAll("/$", ""));
    }

}