package org.jsoup.helper;

public class GeneratedAppendKeyValToInvalidUrlDoesNotModifyUrl {

    @Test
    public void appendKeyValToInvalidUrlDoesNotModifyUrl() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal[] keyVals = {new Connection.KeyVal("key1", "value1"), new Connection.KeyVal("key2", "value2")};
        URL inputUrl = new URL("invalid_url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        for (Connection.KeyVal kv : keyVals) {
            urlBuilder.appendKeyVal(kv);
        }
        assertEquals(new URL("invalid_url"), urlBuilder.build());
    }

}