package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void build() {
        String inputUrl = "https://example.com/path";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        URI uri = outputUrl.toURI();
        assertEquals("https://example.com/path", uri.toString());
    }

    @Test
    public void appendKeyVal() {
        String inputKv = "key=value";
        String inputKey = "key1";
        String inputVal = "value1";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        URLBuilder.AppendKeyVal(urlBuilder, inputKv);
        String expectedKv = "key=1&val=value1";
        assertEquals(expectedKv, urlBuilder.appendKeyVal(inputKv).toString());
    }

    @Test
    public void appendKeyValMalformed() {
        String inputKv = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            fail("Expected MalformedURLException");
        } catch (UnsupportedEncodingException e) {
            // Expected exception
        }
    }

    @Test
    public void appendKeyValUnparsable() {
        String inputKv = "key=abc";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected exception
        }
    }

    @Test
    public void appendKeyValUnparsableMalformed() {
        String inputKv = "key=abc";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            fail("Expected MalformedURLException");
        } catch (UnsupportedEncodingException e) {
            // Expected exception
        }
    }

    @Test
    public void appendKeyValUrlEncode() throws UnsupportedEncodingException {
        String inputKv = "key=value";
        String inputKey = "key1";
        String inputVal = "value1";

        URLBuilder urlBuilder = new UrlBuilder("https://example.com");

        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            assertEquals(inputKey + "=" + URLEncoder.encode(inputVal, UTF_8));
        } catch (UnsupportedEncodingException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void appendKeyValUrlDecode() throws UnsupportedEncodingException {
        String inputKv = "key=value";
        String inputKey = "key1";
        String inputVal = "value1";

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            assertEquals(URLDecoder.decode(inputKey + "=" + URLEncoder.encode(inputVal, UTF_8), UTF_8));
        } catch (UnsupportedEncodingException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void appendKeyValUnparsableUrlDecode() throws UnsupportedEncodingException {
        String inputKv = "key=abc";
        String inputKey = "key1";
        String inputVal = "value1";

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected exception
        }
    }

    @Test
    public void appendKeyValMalformedUrlDecode() throws UnsupportedEncodingException {
        String inputKv = "key=abc";
        String inputKey = "key1";
        String inputVal = "value1";

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            fail("Expected MalformedURLException");
        } catch (UnsupportedEncodingException e) {
            // Expected exception
        }
    }

    @Test
    public void appendKeyValUrlDecodeEmpty() throws UnsupportedEncodingException {
        String inputKv = "";
        String inputKey = "key1";
        String inputVal = "value1";

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            assertEquals(URLDecoder.decode(inputKey + "=" + URLEncoder.encode(inputVal, UTF_8), UTF_8));
        } catch (UnsupportedEncodingException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void appendKeyValUrlDecodeEmptyInput() throws UnsupportedEncodingException {
        String inputKv = "key=value";
        String inputKey = "";
        String inputVal = "value1";

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            assertEquals(URLDecoder.decode(inputKey + "=" + URLEncoder.encode(inputVal, UTF_8), UTF_8));
        } catch (UnsupportedEncodingException e) {
            fail(e.getMessage());
        }
    }

}