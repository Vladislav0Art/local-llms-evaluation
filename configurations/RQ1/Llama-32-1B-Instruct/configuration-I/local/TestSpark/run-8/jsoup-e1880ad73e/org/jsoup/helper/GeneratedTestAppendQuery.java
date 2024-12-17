package org.jsoup.helper;

public class GeneratedTestAppendQuery {

    @Test
    public void TestAppendQuery() {
        String[] inputs = {"http://example.com/path%20with%20spaces", "http://example.com/path%2Bwith%20special%20characters"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
            // assertions
        }
    }

}