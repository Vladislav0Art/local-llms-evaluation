package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendQueryParam_NoParams {

    @Test
    public void appendQueryParam_NoParams() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(Connection.KeyVal.of("key", null));
        assertTrue(builder.build().getQuery().isEmpty());
    }

}