package org.jsoup.helper;

public class GeneratedUrlBuilder_AppendKeyVal_NoUrl_ThrowsMalformedURLException {

    @Test
    public void urlBuilder_AppendKeyVal_NoUrl_ThrowsMalformedURLException() {
        Connection.KeyVal kv = new Connection.KeyVal("", "value");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertThrows(MalformedURLException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}