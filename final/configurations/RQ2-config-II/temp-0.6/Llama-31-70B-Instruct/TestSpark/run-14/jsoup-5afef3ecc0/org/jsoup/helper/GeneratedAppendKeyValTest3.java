package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendKeyValTest3 {

    @Test
    public void appendKeyValTest3() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("one", "two"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("three", "four"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("five", "six"));
        assertNotNull(urlBuilder.q);
        assertEquals("one=two&three=four&five=six", urlBuilder.q.toString());
    }

}