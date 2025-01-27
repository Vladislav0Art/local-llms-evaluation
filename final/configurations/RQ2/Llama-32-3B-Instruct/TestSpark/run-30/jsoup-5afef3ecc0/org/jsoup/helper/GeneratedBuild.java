package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuild {

    @Test
    public void build() throws URISyntaxException, MalformedURLException {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        URL result = builder.build();
        assertNotNull(result);
        assertTrue(IDN.isFullyNormalized(result.getAuthority()));
    }

}