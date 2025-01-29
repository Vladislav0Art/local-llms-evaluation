package org.jsoup.helper;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestAppendKeyVal_KV_InvalidInputString {

    @Mock
    private Connection.KeyVal mockKv;

    @Mock
    private URLDecoder mockDecoder;

    @Test
    public void testAppendKeyVal_KV_InvalidInputString() {
        String inputUrl = "https://example.com/path/to/resource?param1=value1&param2=value2";
        try {
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            urlBuilder.appendKeyVal("invalid-input-string");
        } catch (UnsupportedEncodingException e) {
            // expected behavior
        }
    }

}