package org.jsoup.helper;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValToQueryStringTest {

    @Test
    public void appendKeyValToQueryStringTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.q.append("key=value");
        URL newUrl = urlBuilder.build();
        assertEquals("http://example.com/?key=value", newUrl.toString());
    }

}