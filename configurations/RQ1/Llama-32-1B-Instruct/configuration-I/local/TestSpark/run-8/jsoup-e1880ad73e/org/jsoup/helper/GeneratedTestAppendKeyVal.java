package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void TestAppendKeyVal() {
        String[] inputs = {"key1=value1", "key2=value2"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key2", "value2"));
        }

        // assertions
    }

}