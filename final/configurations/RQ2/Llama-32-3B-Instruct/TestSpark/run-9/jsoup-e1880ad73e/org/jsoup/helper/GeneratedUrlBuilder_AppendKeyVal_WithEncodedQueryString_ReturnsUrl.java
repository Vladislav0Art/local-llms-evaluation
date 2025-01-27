package org.jsoup.helper;

public class GeneratedUrlBuilder_AppendKeyVal_WithEncodedQueryString_ReturnsUrl {

    @Test
    public void urlBuilder_AppendKeyVal_WithEncodedQueryString_ReturnsUrl() throws MalformedURLException {
        String key = "key";
        String encodedQueryString = "value%3Fother%3D%26another";
        Connection.KeyVal kv = new Connection.KeyVal(key, encodedQueryString);
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNotNull(urlBuilder.appendKeyVal(kv));
    }

}