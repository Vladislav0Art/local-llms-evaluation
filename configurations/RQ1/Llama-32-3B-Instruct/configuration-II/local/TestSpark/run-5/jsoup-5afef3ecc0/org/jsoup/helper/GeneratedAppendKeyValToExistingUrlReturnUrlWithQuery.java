package org.jsoup.helper;

public class GeneratedAppendKeyValToExistingUrlReturnUrlWithQuery {

    @Test
    public void appendKeyValToExistingUrlReturnUrlWithQuery() {
        URL inputUrl = new URL("http://example.com/path?query=param");
        Connection.KeyVal[] keyVals = new Connection.KeyVal[]{new Connection.KeyVal("key", "value")};
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(keyVals);
        assertEquals(inputUrl, urlBuilder.u);
    }

}