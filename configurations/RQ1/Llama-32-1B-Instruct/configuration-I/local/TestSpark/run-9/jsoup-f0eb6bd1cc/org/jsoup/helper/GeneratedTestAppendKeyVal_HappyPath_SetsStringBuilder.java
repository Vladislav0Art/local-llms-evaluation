package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_HappyPath_SetsStringBuilder {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("https://example.com/path?a=1&b=2#anchor"));
    }

    @Test
    public void testAppendKeyVal_HappyPath_SetsStringBuilder() {
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals(3, urlBuilder.q.toString().length());
    }

}