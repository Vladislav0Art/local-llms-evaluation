package org.jsoup.helper;

public class GeneratedTestBuildWithNullValue {

    @Test
    public void testBuildWithNullValue() {
        UrlBuilder urlBuilder = new UrlBuilder();
        String result = urlBuilder.build("key", null);
        assertTrue(result.contains("key="));
    }

}