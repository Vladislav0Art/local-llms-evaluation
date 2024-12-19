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

public class GeneratedTestAppendKeyVal_EmptyString {

    @Test
    public void testAppendKeyVal_EmptyString() {
        URLBuilder builder = new UrlBuilder("https://example.com/path?param1=value1&param2=value2");
        builder.appendKeyVal(null, false);
        assertEquals("https%3A%2F%2Fexample.com%2Fpath%3F%26param1%3Dvalue1%26param2%3Dvalue2", builder.build().toString());
    }

}