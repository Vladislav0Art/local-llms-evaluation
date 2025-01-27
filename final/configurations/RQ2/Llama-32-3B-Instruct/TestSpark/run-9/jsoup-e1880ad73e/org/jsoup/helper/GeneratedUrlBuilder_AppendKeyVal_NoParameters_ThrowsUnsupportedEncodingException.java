package org.jsoup.helper;

public class GeneratedUrlBuilder_AppendKeyVal_NoParameters_ThrowsUnsupportedEncodingException {

    @Test
    public void urlBuilder_AppendKeyVal_NoParameters_ThrowsUnsupportedEncodingException() {
        Connection.KeyVal kv = null;
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}