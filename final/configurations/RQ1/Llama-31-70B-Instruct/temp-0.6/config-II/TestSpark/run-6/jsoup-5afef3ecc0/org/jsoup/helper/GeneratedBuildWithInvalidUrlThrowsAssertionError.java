package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedBuildWithInvalidUrlThrowsAssertionError {

    @Test
    public void buildWithInvalidUrlThrowsAssertionError() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com/path/to/file.html");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.q = StringUtil.borrowBuilder().append("query");
        URL result = builder.build();
        assertTrue(result.toString().contains("query"));
    }

}