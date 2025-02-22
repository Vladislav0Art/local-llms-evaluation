package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.internal.StringUtil;

import static org.jsoup.helper.DataUtil.UTF_8;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.IDN;
import javax.annotation.Nullable;

public class GeneratedTest {

    @Test
    public void buildUrlWithQuery() {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        try {
            Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
            urlBuilder.appendKeyVal(keyVal);
            URL result = urlBuilder.build();
            assertEquals("http://www.example.com?key=value", result.toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            fail("Encoding exception occured");
        }
    }

    @Test
    public void buildUrlWithoutQuery() {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertEquals("http://www.example.com", result.toString());
    }

}