package org.jsoup.helper;

public class GeneratedAppendKeyVal_singleKeyValue {

    private UrlBuilder urlBuilder;

    @org.junit.Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void appendKeyVal_singleKeyValue() {
        Map<String, String> queryParams = new HashMap<>();
        when(urlBuilder.inputUrl()).thenReturn(new URL("http://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.setKey("param2").setValue("value2");
        urlBuilder.appendKeyVal(kv);
        assertEquals(1, urlBuilder.inputUrl().getQueryParameters().size());
    }

}