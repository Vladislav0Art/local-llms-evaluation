package org.jsoup.helper;

public class GeneratedUrlBuilder_AppendKeyVal_WithEncodedFormString_ReturnsUrl {

    @Test
    public void urlBuilder_AppendKeyVal_WithEncodedFormString_ReturnsUrl() throws MalformedURLException {
        String key1 = "key1";
        String value1 = "value1";
        String encodedFormStr = "key1=value1&other=2";
        Connection.KeyVal kv = new Connection.KeyVal(key1, encodedFormStr);
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNotNull(urlBuilder.appendKeyVal(kv));
    }

}