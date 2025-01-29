package org.jsoup.helper;

import java.net.URLDecoder;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestAppendKeyVal {

    @Mock
    private Connection.KeyVal mockKv;

    @Mock
    private URLDecoder mockDecoder;

    @Test
    public void testAppendKeyVal() {
        String inputString = "key1=value1&key2=value2";
        String expectedString = "key1=value1&key2=value2";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path/to/resource?param1=value1&param2=value2");
        urlBuilder.appendKeyVal(mockKv);
        assertassertEquals(expectedString, urlBuilder.build().toURL());
    }

}