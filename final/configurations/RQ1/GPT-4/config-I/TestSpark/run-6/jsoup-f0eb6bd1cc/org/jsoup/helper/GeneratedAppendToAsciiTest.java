package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendToAsciiTest {

    @Test
    public void appendToAsciiTest() throws MalformedURLException, UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL("http://jsoup.org");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        String asciiRangeData = "Hello World";
        urlBuilder.appendToAscii(asciiRangeData, true, sb);
        assertTrue(sb.toString().contains("+"));
        sb.setLength(0);
        urlBuilder.appendToAscii(asciiRangeData, false, sb);
        assertTrue(sb.toString().contains("%20"));
    }

}