package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuild_WithNullUrlQuery_ThrowsNullPointerException {

    @Test
    public void build_WithNullUrlQuery_ThrowsNullPointerException() {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.u = null;
        assertThrows(NullPointerException.class, () -> urlBuilder.build());
    }

}