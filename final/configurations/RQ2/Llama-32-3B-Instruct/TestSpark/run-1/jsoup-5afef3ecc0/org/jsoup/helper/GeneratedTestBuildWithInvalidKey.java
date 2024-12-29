package org.jsoup.helper;

public class GeneratedTestBuildWithInvalidKey {

    @Test
    public void testBuildWithInvalidKey() {
        UrlBuilder urlBuilder = new UrlBuilder();
        String result = urlBuilder.build("", "value");
        assertTrue(result.contains("key="));
    }

}