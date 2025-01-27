package org.jsoup.helper;

public class GeneratedUrlBuilder_AppendKeyVal_WithNullUrl_ReturnsNull {

    @Test
    public void urlBuilder_AppendKeyVal_WithNullUrl_ReturnsNull() {
        Connection.KeyVal kv = null;
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNull(urlBuilder.appendKeyVal(kv));
    }

}