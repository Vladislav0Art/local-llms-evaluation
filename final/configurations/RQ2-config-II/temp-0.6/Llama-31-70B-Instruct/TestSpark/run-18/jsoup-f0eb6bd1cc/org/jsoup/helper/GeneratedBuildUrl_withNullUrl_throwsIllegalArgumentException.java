package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrl_withNullUrl_throwsIllegalArgumentException {

    private static final String ENCODED_URL = "http://example.com/path?key=value";

    @Test
    public void buildUrl_withNullUrl_throwsIllegalArgumentException() {
        UrlBuilder urlBuilder = new UrlBuilder(null);

        urlBuilder.build();
    }

}