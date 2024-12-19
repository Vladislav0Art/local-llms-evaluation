package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.mockito.Mockito.*;

public class GeneratedTestAppendKeyVal_UrlWithNonAsciiQueryInFragmentAndPath {

    @Test
    public void testAppendKeyVal_UrlWithNonAsciiQueryInFragmentAndPath() {
        URLBuilder builder = new UrlBuilder("https://example\\u00e9/path#anchor?param1=value1&param2=value2?key=value3");
        builder.appendKeyVal(new Connection.KeyVal.Builder().put("key", "value").build(), false);
        assertEquals("https%3A//example%21space%3Dplus%26param1%3Dvalue1%26param2%3Dvalue2?space%3Dplus%26anchor%3Dspace%3Dplus%26key%3Dvalue3", builder.build().toString());
    }

}