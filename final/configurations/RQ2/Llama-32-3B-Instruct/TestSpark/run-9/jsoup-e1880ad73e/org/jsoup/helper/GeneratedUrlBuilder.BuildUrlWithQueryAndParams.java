package org.jsoup.helper;

import org.jsoup.helper.URL;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

public class GeneratedUrlBuilder.

BuildUrlWithQueryAndParams {

    @Test
    public void urlBuilder.BuildUrlWithQueryAndParams() {
        String scheme = "https";
        String query = "param1=value1&param2=value2";
        assertEquals(scheme + "?" + query, new UrlBuilder(new URL(scheme + "://example.com" + query)).build().getScheme() + "://" + new URL(scheme + "://example.com" + query).getQuery());
    }

}