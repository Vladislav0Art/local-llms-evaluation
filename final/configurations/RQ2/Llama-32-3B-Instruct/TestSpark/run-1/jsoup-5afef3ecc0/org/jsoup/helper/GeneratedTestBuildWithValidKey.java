package org.jsoup.helper;

public class GeneratedTestBuildWithValidKey {

    @Test
    public void testBuildWithValidKey() {
        UrlBuilder urlBuilder = new UrlBuilder();
        String result = urlBuilder.build("key", "value");
        assertTrue(result.contains("key=value"));
    }

}