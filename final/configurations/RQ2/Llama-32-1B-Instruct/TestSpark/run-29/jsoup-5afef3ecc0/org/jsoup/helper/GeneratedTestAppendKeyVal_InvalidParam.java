package org.jsoup.helper;

import java.net.URLDecoder;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestAppendKeyVal_InvalidParam {

    @Mock
    private Connection.KeyVal mockKv;

    @Mock
    private URLDecoder mockDecoder;

    @Test
    public void testAppendKeyVal_InvalidParam() {
        String inputUrl = "https://example.com/path/to/resource?param1=value1&param2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        try {
            urlBuilder.appendKeyVal(new URL("invalid-url", mockKv));
        } catch (UnsupportedEncodingException e) {
            // expected behavior
        }
    }

}