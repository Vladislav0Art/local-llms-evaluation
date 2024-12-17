package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;

public class GeneratedNewUrlBuilderFromUrl {

    @Test
    public void newUrlBuilderFromUrl() {
        URL url = new URL("http://a.com?b=1#c");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder.u);
    }

}