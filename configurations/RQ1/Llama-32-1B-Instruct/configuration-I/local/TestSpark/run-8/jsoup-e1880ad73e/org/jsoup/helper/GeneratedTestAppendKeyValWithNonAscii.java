package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithNonAscii {

    @Test
    public void TestAppendKeyValWithNonAscii() {
        String[] inputs = {"key%20is a test", "key2=value2"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key2", "value2"));
        }

        // assertions
    }

}