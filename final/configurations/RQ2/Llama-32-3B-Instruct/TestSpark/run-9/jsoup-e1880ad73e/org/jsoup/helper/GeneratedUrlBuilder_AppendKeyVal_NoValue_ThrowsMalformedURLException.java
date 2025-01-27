package org.jsoup.helper;

public class GeneratedUrlBuilder_AppendKeyVal_NoValue_ThrowsMalformedURLException {

    @Test
    public void urlBuilder_AppendKeyVal_NoValue_ThrowsMalformedURLException() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertThrows(MalformedURLException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}