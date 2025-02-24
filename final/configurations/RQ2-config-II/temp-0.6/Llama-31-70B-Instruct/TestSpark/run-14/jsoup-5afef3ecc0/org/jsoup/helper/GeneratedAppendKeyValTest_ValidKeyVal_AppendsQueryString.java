package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest_ValidKeyVal_AppendsQueryString {

    @Test
    public void appendKeyValTest_ValidKeyVal_AppendsQueryString() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("foo", "bar");
        urlBuilder.appendKeyVal(kv);
        URL result = urlBuilder.build();
        assertEquals("https://www.example.com/?foo=bar", result.toString());
    }

}