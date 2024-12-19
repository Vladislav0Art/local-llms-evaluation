package org.jsoup.helper;

public class GeneratedAppendKeyVal_multipleKeyValues {

    private UrlBuilder urlBuilder;

    @org.junit.Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void appendKeyVal_multipleKeyValues() {
        Map<String, String> queryParams = new HashMap<>();
        when(urlBuilder.inputUrl()).thenReturn(new URL("http://example.com"));
        Connection.KeyVal kv1 = new Connection.KeyVal();
        kv1.setKey("param2").setValue("value2");
        Connection.KeyVal kv2 = new Connection.KeyVal();
        kv2.setKey("param3").setValue("value3");
        urlBuilder.appendKeyVal(new Connection.KeyVal[]{kv1, kv2});
        assertEquals(2, urlBuilder.inputUrl().getQueryParameters().size());
    }

}