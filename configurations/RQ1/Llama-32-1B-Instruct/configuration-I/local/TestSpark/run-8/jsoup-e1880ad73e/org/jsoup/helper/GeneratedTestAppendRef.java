package org.jsoup.helper;

public class GeneratedTestAppendRef {

    @Test
    public void TestAppendRef() {
        String[] inputs = {"http://example.com/path#with#spaces", "http://example.com/path%23with%20special%20characters"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
            // assertions
        }
    }

}