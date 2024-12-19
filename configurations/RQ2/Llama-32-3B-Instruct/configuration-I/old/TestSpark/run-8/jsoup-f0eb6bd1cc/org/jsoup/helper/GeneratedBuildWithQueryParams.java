package org.jsoup.helper;

import org.jsoup.helper.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder.UnsupportedEncodingException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedBuildWithQueryParams {

    @Test
    public void buildWithQueryParams() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("https://example.com?param1=value1&param2=value2");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("https://example.com?param1=value1", builder.build().toString(), false);
    }

}