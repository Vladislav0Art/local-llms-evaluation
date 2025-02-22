package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder builder;

    @Before
    public void setup() {
        builder = new UrlBuilder(new URL("http://example.com/"));
    }

    @Test
    public void build_WithValidInput_ExpectValidOutput() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://example.com/", builtUrl.toString());
    }

    @Test
    public void build_WithInvalidInput_ExpectMalformedUrlException() throws MalformedURLException {
        URL inputUrl = new URL("invalid");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

    @Test
    public void appendKeyVal_WithValidInput_ExpectValidOutput() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("http://example.com/?key=value", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyVal_WithEmptyKey_ExpectValidOutput() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("", "value");
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("http://example.com/?=value", urlBuilder.build().toString());
    }

}