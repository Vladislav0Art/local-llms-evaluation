package org.jsoup.helper;

public class GeneratedUrlBuilder_AppendKeyVal_WithNullValue_ThrowsMalformedURLException {

    @Test
    public void urlBuilder_AppendKeyVal_WithNullValue_ThrowsMalformedURLException() {
        String key = "key";
        Connection.KeyVal kv = new Connection.KeyVal(key, null);
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertThrows(MalformedURLException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}