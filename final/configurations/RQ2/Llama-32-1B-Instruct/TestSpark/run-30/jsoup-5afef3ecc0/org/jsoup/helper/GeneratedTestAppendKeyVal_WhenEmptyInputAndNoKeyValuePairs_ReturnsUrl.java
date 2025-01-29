package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WhenEmptyInputAndNoKeyValuePairs_ReturnsUrl {

    private UrlBuilder underTest;

    @Before
    void setup() {
        // no-op
    }

    @Test
    public void testAppendKeyVal_WhenEmptyInputAndNoKeyValuePairs_ReturnsUrl() {
        URLBuilder builder = new UrlBuilder(new URI("http://example.com"));
        underTest.appendKeyVal(null);
        assertEquals("http://example.com", underTest.build().toString());
    }

}