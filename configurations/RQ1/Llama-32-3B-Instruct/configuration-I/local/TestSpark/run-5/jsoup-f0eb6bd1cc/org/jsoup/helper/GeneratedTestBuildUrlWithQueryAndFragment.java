package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedTestBuildUrlWithQueryAndFragment {

    @Test
    public void testBuildUrlWithQueryAndFragment() throws Exception {
        URL url = new URL("http://example.com#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        String expectedQueryString = "";
        assertEquals(expectedQueryString, (String) builder.build().getQuery());
    }
}

public class UrlBuilder {

    private URL url;
    private URI parsedUrl;

    public UrlBuilder(URL url) {
        this.url = url;
        this.parsedUrl = url.toURI();
    }

    public String build() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        if (parsedUrl.getQuery() != null) {
            sb.append(parsedUrl.getScheme()).append("://").append(parsedUrl.getHost())
                    .append("?query=").append(URLEncoder.encode(parsedUrl.getQuery(), "UTF-8"));
        }
        return sb.toString();
    }

    public String getQuery() throws UnsupportedEncodingException {
        if (parsedUrl.getQuery() != null) {
            return URLEncoder.encode(parsedUrl.getQuery(), "UTF-8");
        } else {
            return "";
        }
    }

}