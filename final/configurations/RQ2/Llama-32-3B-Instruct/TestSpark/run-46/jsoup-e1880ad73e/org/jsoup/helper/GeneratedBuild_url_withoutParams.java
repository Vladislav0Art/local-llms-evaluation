package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedBuild_url_withoutParams {

    public void createUrlBuilder_fromNull_url() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void build_url_withoutParams() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost:8080"));
        assertEquals("http://localhost:8080", urlBuilder.build().toString());
    }

}