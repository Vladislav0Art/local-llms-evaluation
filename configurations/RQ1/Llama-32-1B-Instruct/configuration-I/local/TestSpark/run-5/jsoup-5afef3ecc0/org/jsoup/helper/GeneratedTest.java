package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testAppendKeyVal() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1&param2=value2");
        builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        assertSame(builder.build(), "http://example.com/path?param1=value1%26param2=%26value2");
    }

    @Test
    public void testAppendKeyVal_NegativeRef() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path#ref=1234567890");
        builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        assertSame(builder.build(), "http://example.com/path?ref=1234567890%26param1=value1&param2=value2");
    }

    @Test
    public void testAppendKeyVal_ReplaceEmptyString() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1&param2=");
        builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        assertSame(builder.build(), "http://example.com/path?param1=value1%26param2%3D");
    }

    @Test
    public void testAppendKeyVal_URLDecode() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1&param2=%2B");
        builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        assertSame(builder.build(), "http://example.com/path%26param1=value1&param2=%26");
    }

    @Test
    public void testAppendKeyVal_URLEncode() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1&param2=+value2");
        builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        assertSame(builder.build(), "http%3A//example.com/path%23param1=value1%26param2%3D%26");
    }

    @Test
    public void testAppendKeyVal_MalformedURL() {
        UrlBuilder builder = new UrlBuilder(new MalformedURLException("invalid url"));
        assertThrows(MalformedURLException.class, () -> builder.appendKeyVal(null));
    }

    @Test
    public void testAppendKeyVal_InvalidQuery() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1");
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal("key", "%20value2"));
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyVal_InvalidRef() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1&ref=abc");
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyVal_NegativeQuery() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1&%3Dref");
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}