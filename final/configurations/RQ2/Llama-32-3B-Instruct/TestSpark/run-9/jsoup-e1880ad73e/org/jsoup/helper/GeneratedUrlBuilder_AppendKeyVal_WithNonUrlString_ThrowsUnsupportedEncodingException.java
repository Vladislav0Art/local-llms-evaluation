package org.jsoup.helper;

public class GeneratedUrlBuilder_AppendKeyVal_WithNonUrlString_ThrowsUnsupportedEncodingException {

    @Test
    public void urlBuilder_AppendKeyVal_WithNonUrlString_ThrowsUnsupportedEncodingException() {
        String nonUrlStr = "non_url";
        Connection.KeyVal kv = new Connection.KeyVal(nonUrlStr, "");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}