package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendKeyValTest2 {

    @Test
    public void appendKeyValTest2() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("one", "two"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("three", "four"));
        assertNotNull(urlBuilder.q);
        assertEquals("one=two&three=four", urlBuilder.q.toString());
    }

}