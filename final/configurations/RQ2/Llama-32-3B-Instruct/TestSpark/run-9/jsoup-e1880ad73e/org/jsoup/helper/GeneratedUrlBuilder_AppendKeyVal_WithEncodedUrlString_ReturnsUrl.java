package org.jsoup.helper;

public class GeneratedUrlBuilder_AppendKeyVal_WithEncodedUrlString_ReturnsUrl {

    @Test
    public void urlBuilder_AppendKeyVal_WithEncodedUrlString_ReturnsUrl() throws MalformedURLException {
        String encodedUrlStr = "http%3A//localhost";
        Connection.KeyVal kv = new Connection.KeyVal(encodedUrlStr, "");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNotNull(urlBuilder.appendKeyVal(kv));
    }

}