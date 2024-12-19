package org.jsoup.helper;

public class GeneratedAppendKeyValToNormalUrlEncodesKeysAndValuesCorrectly {

    @Test
    public void appendKeyValToNormalUrlEncodesKeysAndValuesCorrectly() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal[] keyVals = {new Connection.KeyVal("key1", "value1"), new Connection.KeyVal("key2", "value2")};
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        for (Connection.KeyVal kv : keyVals) {
            urlBuilder.appendKeyVal(kv);
        }
        assertEquals(new URL("http://example.com/path?key1%3Dvalue1&key2%3Dvalue2"), urlBuilder.build());
    }

}