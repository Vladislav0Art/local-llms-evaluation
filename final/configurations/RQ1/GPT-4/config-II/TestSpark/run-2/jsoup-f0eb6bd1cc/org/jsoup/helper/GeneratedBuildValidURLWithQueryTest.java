package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildValidURLWithQueryTest {

    @Test
    public void buildValidURLWithQueryTest() throws MalformedURLException {
        URL url = new URL("https://www.google.com/search?q=jsoup");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal kv = Connection.KeyVal.create("hl", "en");
        try {
            builder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException ex) {
            fail("Exception should not be thrown");
        }
        URL result = builder.build();
        assertEquals("https://www.google.com/search?q=jsoup&hl=en", result.toString());
    }

}