package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.util.HashMap;

public class GeneratedQueryStringsAppendCorrectly {

    @Test
    public void queryStringsAppendCorrectly() {
        URL inputUrl = new URL("http://example.com?query=123");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals("?query=123", builder.q.toString());
    }

}