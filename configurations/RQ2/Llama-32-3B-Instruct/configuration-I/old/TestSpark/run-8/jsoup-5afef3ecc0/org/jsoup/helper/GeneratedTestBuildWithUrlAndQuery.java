package org.jsoup.helper;

public class GeneratedTestBuildWithUrlAndQuery {

    @Test
    public void testBuildWithUrlAndQuery() {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Map<String, String> queryMap = new HashMap<>();
        queryMap.put("key", "value");
        urlBuilder.appendKeyVal(queryMap);
        assertEquals(urlInput + "?key=value", urlBuilder.build().toString());
    }

}