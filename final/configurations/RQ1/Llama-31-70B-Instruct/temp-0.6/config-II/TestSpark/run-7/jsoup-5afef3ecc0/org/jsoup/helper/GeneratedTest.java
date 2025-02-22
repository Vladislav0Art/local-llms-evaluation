package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedTest {

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("http://example.com/test");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expected = new URL("http://example.com/test");
        URL actual = builder.build();
        assertEquals(expected, actual);
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = new URL("http://example.com/test");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
    }

}