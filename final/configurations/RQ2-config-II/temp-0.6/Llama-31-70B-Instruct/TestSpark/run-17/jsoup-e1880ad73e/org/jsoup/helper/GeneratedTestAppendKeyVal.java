package org.jsoup.helper;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com/test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL url = urlBuilder.build();
        assertEquals("https://www.example.com/test?key=value", url.toString());
    }

}