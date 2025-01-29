package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithEmptyKey {

    private UrlBuilder underTest;

    @Before
    public void setUp() {
        String baseUrl = "http://example.com";
        URL inputUrl = new URI(baseUrl);
        underTest = new UrlBuilder(inputUrl);
    }

    @Test
    public void testAppendKeyVal_WithEmptyKey() {
        URL outputUrl = underTest.build();
        try {
            underTest.appendKeyVal(new org.jsoup.KeyVal("", ""));
        } catch (UnsupportedEncodingException e) {
            fail("Expected an UnsupportedEncodingException: " + e.getMessage());
        }
    }

}