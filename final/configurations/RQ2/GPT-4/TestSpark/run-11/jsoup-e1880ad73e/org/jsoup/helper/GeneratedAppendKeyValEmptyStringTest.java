package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class GeneratedAppendKeyValEmptyStringTest {

    @Test
    public void appendKeyValEmptyStringTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder);

        Connection.KeyVal keyVal = Connection.KeyVal.create("", "");
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(keyVal));
    }

}