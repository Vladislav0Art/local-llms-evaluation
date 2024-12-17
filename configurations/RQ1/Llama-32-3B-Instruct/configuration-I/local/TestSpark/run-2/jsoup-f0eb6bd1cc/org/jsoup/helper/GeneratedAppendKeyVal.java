package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.jsoup.Connection.KeyVal;

public class GeneratedAppendKeyVal {

    @Test
    public void appendKeyVal() throws Exception {
        String expectedQuery = "key=1&value=2";
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        Connection.KeyVal[] kvArray = {{Connection.KeyVal.KEY, "key"}, {Connection.KeyVal.VALUE, "value"}};
        for (Connection.KeyVal kv : kvArray) {
            builder.appendKeyVal(kv);
        }
        assertEquals(expectedQuery, String.format("%s?%s", builder.u.getProtocol(), builder.q.toString()));
    }

}