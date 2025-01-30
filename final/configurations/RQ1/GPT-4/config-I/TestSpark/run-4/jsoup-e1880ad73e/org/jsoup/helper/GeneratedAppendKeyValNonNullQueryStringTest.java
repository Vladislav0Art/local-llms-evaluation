package org.jsoup.helper;

import org.jsoup.Connection;
import org.hamcrest.Matchers;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class GeneratedAppendKeyValNonNullQueryStringTest {

    @Test
    public void appendKeyValNonNullQueryStringTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("https://www.google.com/path?parameter=value");
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(Connection.KeyVal.create("key", "value"));
        String expected = "parameter=value&key=value";
        assertEquals(expected, builder.q.toString());
    }

}