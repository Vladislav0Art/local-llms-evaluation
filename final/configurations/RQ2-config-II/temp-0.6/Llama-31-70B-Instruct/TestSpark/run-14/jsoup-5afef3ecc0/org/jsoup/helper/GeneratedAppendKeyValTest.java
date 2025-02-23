package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("one", "two"));
        assertNotNull(urlBuilder.q);
        assertEquals("one=two", urlBuilder.q.toString());
    }

}