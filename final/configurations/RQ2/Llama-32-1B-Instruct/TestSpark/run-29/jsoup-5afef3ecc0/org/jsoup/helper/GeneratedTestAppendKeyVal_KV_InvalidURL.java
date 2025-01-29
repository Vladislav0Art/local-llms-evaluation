package org.jsoup.helper;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestAppendKeyVal_KV_InvalidURL {

    @Mock
    private Connection.KeyVal mockKv;

    @Mock
    private URLDecoder mockDecoder;

    @Test
    public void testAppendKeyVal_KV_InvalidURL() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource?param1=value1&param2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        try {
            urlBuilder.appendKeyVal(new URL("invalid-url", mockKv));
        } catch (UnsupportedEncodingException e) {
            // expected behavior
        }
    }

}