package org.jsoup.helper;

import java.net.URLDecoder;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestAppendKeyVal_InvalidDecoder {

    @Mock
    private Connection.KeyVal mockKv;

    @Mock
    private URLDecoder mockDecoder;

    @Test
    public void testAppendKeyVal_InvalidDecoder() {
        String inputString = "https://example.com/path/to/resource?param1=value1&param2=value2";
        try {
            UrlBuilder urlBuilder = new UrlBuilder(inputString);
            urlBuilder.appendKeyVal(new URLDecoder("invalid-decoder"));
        } catch (UnsupportedEncodingException e) {
            // expected behavior
        }
    }

}