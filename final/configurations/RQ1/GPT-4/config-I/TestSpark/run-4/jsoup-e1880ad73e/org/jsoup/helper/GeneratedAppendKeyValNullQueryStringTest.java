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

public class GeneratedAppendKeyValNullQueryStringTest {

    @Test
    public void appendKeyValNullQueryStringTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("https://www.google.com/path");
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(Connection.KeyVal.create("key", "value"));
        String expected = "key=value";
        assertEquals(expected, builder.q.toString());
    }

}