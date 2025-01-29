package org.jsoup.helper;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Mock
    private Connection.KeyVal mockKv;

    @Mock
    private URLDecoder mockDecoder;

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com/path/to/resource?param1=value1&param2=value2";
        URL result = build(inputUrl);
        assertNotEquals(null, result);
    }

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

    @Test
    public void testAppendKeyVal_KV_InvalidParam() {
        String inputUrl = "https://example.com/path/to/resource?param1=value1&param2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        try {
            urlBuilder.appendKeyVal(new URL("invalid-url", mockKv));
        } catch (UnsupportedEncodingException e) {
            // expected behavior
        }
    }

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

    @Test
    public void testAppendKeyVal_KV_URLDecoder() throws UnsupportedEncodingException {
        String inputString = "https://example.com/path/to/resource?param1=value1&param2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(inputString);
        URL result = urlBuilder.build();
        assertNotEquals(null, result);
    }

    private URL build(String inputUrl) throws MalformedURLException {
        String[] parts = inputUrl.split("://");
        URI uri = new URI(parts[0], null, parts[1], null, null);

        Pattern pattern = Pattern.compile("^([a-zA-Z]+)(\\?[a-zA-Z_=]+)?$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(uri.getScheme());
        if (matcher.find()) {
            return new URL(uri.getScheme(), uri.getAuthority(), matcher.group(1), matcher.group(2));
        } else {
            return urlBuilder.build(inputUrl);
        }
    }

    @Test
    public void testAppendKeyVal_KV_InvalidParam_SingleChar() {
        String inputString = "https://example.com/path/to/resource?param1=value1&param2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(inputString);
        try {
            urlBuilder.appendKeyVal(new URL("invalid-url", mockKv));
        } catch (UnsupportedEncodingException e) {
            // expected behavior
        }
    }

    @Test
    public void testAppendKeyVal_KV_InvalidParam_SingleChar_MalformedURL() throws UnsupportedEncodingException {
        String inputString = "https://example.com/path/to/resource?param1=value1&param2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(inputString);
        try {
            urlBuilder.appendKeyVal(new URL("a", mockKv));
        } catch (UnsupportedEncodingException e) {
            // expected behavior
        }
    }

}