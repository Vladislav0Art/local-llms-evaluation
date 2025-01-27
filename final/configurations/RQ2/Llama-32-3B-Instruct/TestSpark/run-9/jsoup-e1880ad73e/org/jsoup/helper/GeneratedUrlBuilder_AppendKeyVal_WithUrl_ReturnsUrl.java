package org.jsoup.helper;

public class GeneratedUrlBuilder_AppendKeyVal_WithUrl_ReturnsUrl {

    @Test
    public void urlBuilder_AppendKeyVal_WithUrl_ReturnsUrl() throws MalformedURLException {
        String urlStr = "http://localhost";
        Connection.KeyVal kv = new Connection.KeyVal(urlStr, "");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNotNull(urlBuilder.appendKeyVal(kv));
    }

}