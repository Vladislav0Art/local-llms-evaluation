package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com/"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL url = urlBuilder.build();
        assertEquals("http://www.example.com/?key=value", url.toExternalForm());
    }

}