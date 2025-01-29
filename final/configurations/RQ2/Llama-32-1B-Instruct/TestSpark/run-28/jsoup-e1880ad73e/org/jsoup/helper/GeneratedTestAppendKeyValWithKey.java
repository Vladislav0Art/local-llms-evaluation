package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithKey {

    private UrlBuilder underTest;

    @Before
    public void setUp() {
        String baseUrl = "http://example.com";
        URL inputUrl = new URI(baseUrl);
        underTest = new UrlBuilder(inputUrl);
    }

    @Test
    public void testAppendKeyValWithKey() {
        URL outputUrl = underTest.build();
        try {
            underTest.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        } catch (UnsupportedEncodingException e) {
            fail("Expected an UnsupportedEncodingException: " + e.getMessage());
        }
    }

}