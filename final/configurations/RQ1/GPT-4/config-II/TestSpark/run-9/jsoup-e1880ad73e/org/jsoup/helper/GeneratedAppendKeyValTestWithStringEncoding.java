package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedAppendKeyValTestWithStringEncoding {

    @Test
    public void appendKeyValTestWithStringEncoding() throws Exception {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(new Connection.KeyVal("key", "\uD83D\uDE00"));
    }

}