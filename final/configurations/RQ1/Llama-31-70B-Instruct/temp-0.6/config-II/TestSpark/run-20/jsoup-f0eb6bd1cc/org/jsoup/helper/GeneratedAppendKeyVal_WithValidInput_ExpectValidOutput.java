package org.jsoup.helper;

public class GeneratedAppendKeyVal_WithValidInput_ExpectValidOutput {

    private UrlBuilder builder;

    @Before
    public void setup() {
        builder = new UrlBuilder(new URL("http://example.com/"));
    }

    @Test
    public void appendKeyVal_WithValidInput_ExpectValidOutput() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("http://example.com/?key=value", urlBuilder.build().toString());
    }

}