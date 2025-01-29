package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WhenEmptyInputAndNoKeyVal_ReturnsUrl {

    private UrlBuilder underTest;

    @Before
    void setup() {
        // no-op
    }

    @Test
    public void testAppendKeyVal_WhenEmptyInputAndNoKeyVal_ReturnsUrl() {
        URLBuilder builder = new UrlBuilder(new URI("http://example.com"));
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = new Connection.KeyVal();
        underTest.appendKeyVal(kv1);
        underTest.appendKeyVal(kv2);
        assertEquals("http://example.com", underTest.build().toString());
    }

}