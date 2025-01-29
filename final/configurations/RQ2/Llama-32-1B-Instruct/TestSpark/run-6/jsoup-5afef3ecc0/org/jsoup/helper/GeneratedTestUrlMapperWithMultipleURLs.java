package org.jsoup.helper;

public class GeneratedTestUrlMapperWithMultipleURLs {

    public String buildString(String baseUrl) {
        // implementation of buildString method goes here
        return "";
    }

    @Test
    public void testUrlMapperWithMultipleURLs() throws Exception {
        String baseUrl = "https://example.com/path1/path2/path3";
        String[] expectedResult = {"https://example.com/path1", "http://example.com/path2", "http://example.com/path3"};
        Assert.assertEquals(Arrays.asList(expectedResult), buildString(baseUrl));
    }

}