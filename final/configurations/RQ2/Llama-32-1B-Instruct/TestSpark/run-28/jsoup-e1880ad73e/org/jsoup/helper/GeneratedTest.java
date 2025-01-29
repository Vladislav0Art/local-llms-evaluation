package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder underTest;

    @Before
    public void setUp() {
        String baseUrl = "http://example.com";
        URL inputUrl = new URI(baseUrl);
        underTest = new UrlBuilder(inputUrl);
    }

    @Test
    public void testBuild() {
        URL outputUrl = underTest.build();
        assertNotNull(outputUrl);
        try {
            new URL(new java.net.URL(url));
        } catch (MalformedURLException e) {
            fail("Failed to create a new URL: " + e.getMessage());
        }
    }

    @Test
    public void testAppendKeyVal_WithoutKey() {
        URL outputUrl = underTest.build();
        try {
            underTest.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        } catch (UnsupportedEncodingException e) {
            fail("Expected an UnsupportedEncodingException: " + e.getMessage());
        }
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

    @Test
    public void testAppendKeyValWithValue() {
        URL outputUrl = underTest.build();
        try {
            underTest.appendKeyVal(new org.jsoup.KeyVal(null, "value"));
        } catch (UnsupportedEncodingException e) {
            fail("Expected an UnsupportedEncodingException: " + e.getMessage());
        }
    }

    @Test
    public void testAppendKeyValWithEmptyValue() {
        URL outputUrl = underTest.build();
        try {
            underTest.appendKeyVal(new org.jsoup.KeyVal("", "value"));
        } catch (UnsupportedEncodingException e) {
            fail("Expected an UnsupportedEncodingException: " + e.getMessage());
        }
    }

    @Test
    public void testAppendKeyVal_WithNullValue() {
        URL outputUrl = underTest.build();
        try {
            underTest.appendKeyVal(new org.jsoup.KeyVal(null, null));
        } catch (UnsupportedEncodingException e) {
            fail("Expected an UnsupportedEncodingException: " + e.getMessage());
        }
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

    @Test
    public void testAppendKeyVal_WithEmptyValueAndNullKey() {
        URL outputUrl = underTest.build();
        try {
            underTest.appendKeyVal(new org.jsoup.KeyVal(null, null));
        } catch (UnsupportedEncodingException e) {
            fail("Expected an UnsupportedEncodingException: " + e.getMessage());
        }
    }

    @After
    public void tearDown() {
    }

}