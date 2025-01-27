package org.jsoup.helper;

public class GeneratedUrlBuilder_AppendKeyVal_WithEncodedValueString_ReturnsUrl {

    @Test
    public void urlBuilder_AppendKeyVal_WithEncodedValueString_ReturnsUrl() throws MalformedURLException {
        String key = "key";
        String encodedValueStr = "value%3F";
        Connection.KeyVal kv = new Connection.KeyVal(key, encodedValueStr);
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNotNull(urlBuilder.appendKeyVal(kv));
    }

}