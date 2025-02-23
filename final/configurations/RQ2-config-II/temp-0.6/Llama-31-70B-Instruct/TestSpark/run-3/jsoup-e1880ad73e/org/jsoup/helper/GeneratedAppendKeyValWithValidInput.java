package org.jsoup.helper;

import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValWithValidInput {

    @Test
    public void appendKeyValWithValidInput() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal("key=value");
        String expectedQuery = "key%3Dvalue";
        assertEquals(expectedQuery, urlBuilder.q.toString());
    }

}