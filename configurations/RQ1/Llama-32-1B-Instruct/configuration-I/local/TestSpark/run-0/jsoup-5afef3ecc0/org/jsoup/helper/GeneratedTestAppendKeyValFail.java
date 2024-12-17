package org.jsoup.helper;

public class GeneratedTestAppendKeyValFail {

    private UrlBuilder urlBuilder;

    @Test
    public void testAppendKeyValFail() {
        String[] kv = {("key", null),("another_key", "value")};
        urlBuilder.appendKeyVal(kv);
        // assert that exception is thrown or handled in some way
        assert false;
    }

}