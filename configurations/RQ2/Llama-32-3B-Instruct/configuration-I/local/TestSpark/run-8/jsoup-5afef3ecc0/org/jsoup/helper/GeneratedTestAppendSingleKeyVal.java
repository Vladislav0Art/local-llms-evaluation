package org.jsoup.helper;

public class GeneratedTestAppendSingleKeyVal {

    @Test
    public void testAppendSingleKeyVal() {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Map<String, String> queryMap = new HashMap<>();
        queryMap.put("key", "value");
        urlBuilder.appendKeyVal(queryMap);
        assertNotNull(urlBuilder.build());
    }

}