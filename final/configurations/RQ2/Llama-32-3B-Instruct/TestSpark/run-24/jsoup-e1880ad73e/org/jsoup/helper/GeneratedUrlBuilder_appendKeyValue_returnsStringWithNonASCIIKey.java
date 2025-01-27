package org.jsoup.helper;

public class GeneratedUrlBuilder_appendKeyValue_returnsStringWithNonASCIIKey {

    @Test
    public void urlBuilder_appendKeyValue_returnsStringWithNonASCIIKey() {
        Connection.KeyVal kv = Connection.KeyVal.of(IDN.toUTF8("ä"), "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        String result = urlBuilder.appendKeyVal(kv).encode();
        assertNotNull(result);
        assertTrue(result.contains("ä=value"));
    }

}