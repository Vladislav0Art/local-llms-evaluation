package org.jsoup.helper;

public class GeneratedTestBuildWithUrlAndQueryAndFragment {

    @Test
    public void testBuildWithUrlAndQueryAndFragment() {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Map<String, String> queryMap = new HashMap<>();
        queryMap.put("key", "value");
        urlBuilder.appendKeyVal(queryMap);
        assertEquals(urlInput + "?key=value#fragment", urlBuilder.build().toString());
    }

}