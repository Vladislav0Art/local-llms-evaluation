package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        URL url = new URL("http://example.com:8080/path/to/file?key=value#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        try {
            urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value2"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        assertEquals("http://xn--example-hva.com:8080/path/to/file?key=value&key2=value2#anchor", urlBuilder.build().toString());
    }

}