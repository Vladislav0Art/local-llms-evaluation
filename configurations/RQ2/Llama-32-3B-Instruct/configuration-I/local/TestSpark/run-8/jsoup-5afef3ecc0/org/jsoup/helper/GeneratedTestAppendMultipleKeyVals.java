package org.jsoup.helper;

public class GeneratedTestAppendMultipleKeyVals {

    @Test
    public void testAppendMultipleKeyVals() {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Map<String, String> queryMap1 = new HashMap<>();
        queryMap1.put("key1", "value1");
        Map<String, String> queryMap2 = new HashMap<>();
        queryMap2.put("key2", "value2");
        urlBuilder.appendKeyVal(queryMap1);
        urlBuilder.appendKeyVal(queryMap2);
        assertNotNull(urlBuilder.build());
    }

}