package org.jsoup.helper;

public class GeneratedUrlBuilder_AppendKeyVal_WithNonStringValue_ThrowsMalformedURLException {

    @Test
    public void urlBuilder_AppendKeyVal_WithNonStringValue_ThrowsMalformedURLException() {
        String key = "key";
        Connection.KeyVal kv = new Connection.KeyVal(key, null);
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertThrows(MalformedURLException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}