package org.jsoup.helper;

public class GeneratedTestUrlMapperWithParams {

    public String buildString(String baseUrl) {
        // implementation of buildString method goes here
        return "";
    }

    @Test
    public void testUrlMapperWithParams() throws Exception {
        String baseUrl = "http://example.com/path/to/resource?param1=value1&param2=value2";
        String[] expectedResult = {"https://example.com/path/to/resource", "http://example.com/path/to/resource?param1=value1&param2=value2"};
        Assert.assertEquals(Arrays.asList(expectedResult), buildString(baseUrl));
    }

}