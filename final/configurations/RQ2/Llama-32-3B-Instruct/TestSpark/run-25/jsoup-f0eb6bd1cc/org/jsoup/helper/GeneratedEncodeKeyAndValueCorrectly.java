package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedEncodeKeyAndValueCorrectly {

    @Test
    public void encodeKeyAndValueCorrectly() throws UnsupportedEncodingException {
        String key = "test";
        String value = "test";
        String encodedKey = URLEncoder.encode(key, DataUtil.UTF_8);
        String encodedValue = URLEncoder.encode(value, DataUtil.UTF_8);
        assertEquals("key=" + encodedKey + "&value=" + encodedValue, builder().appendKeyVal(Connection.KeyVal.of(key, value)).build());
    }

}