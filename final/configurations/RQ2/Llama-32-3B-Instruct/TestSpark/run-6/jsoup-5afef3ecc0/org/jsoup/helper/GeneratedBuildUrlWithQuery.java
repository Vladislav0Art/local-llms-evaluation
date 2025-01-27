package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuildUrlWithQuery {

    @Test
    public void buildUrlWithQuery() {
        URL url = new URL("https://example.com?query=hello");
        UrlBuilder builder = new UrlBuilder(url);
        URI uri = builder.build().toURI();
        assertThat(uri, notNullValue());
        assertThat(uri.getScheme(), is("https"));
        assertThat(uri.getHost(), is("example.com"));
        assertThat(uri.getQuery(), is("query=hello"));
    }

}