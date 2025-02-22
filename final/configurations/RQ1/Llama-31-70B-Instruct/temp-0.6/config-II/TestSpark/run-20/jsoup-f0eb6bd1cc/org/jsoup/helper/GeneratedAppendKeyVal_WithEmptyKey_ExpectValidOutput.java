package org.jsoup.helper;

public class GeneratedAppendKeyVal_WithEmptyKey_ExpectValidOutput {

    private UrlBuilder builder;

    @Before
    public void setup() {
        builder = new UrlBuilder(new URL("http://example.com/"));
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