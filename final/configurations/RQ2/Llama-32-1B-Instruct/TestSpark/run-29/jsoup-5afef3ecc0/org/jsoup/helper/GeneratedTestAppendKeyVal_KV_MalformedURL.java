package org.jsoup.helper;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestAppendKeyVal_KV_MalformedURL {

    @Mock
    private Connection.KeyVal mockKv;

    @Mock
    private URLDecoder mockDecoder;

    @Test
    public void testAppendKeyVal_KV_MalformedURL() {
        String inputString = "https://example.com/path/to/resource?param1=value1&param2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(inputString);
        try {
            urlBuilder.appendKeyVal(new MalformedURLException());
        } catch (MalformedURLException e) {
            // expected behavior
        }
    }

}