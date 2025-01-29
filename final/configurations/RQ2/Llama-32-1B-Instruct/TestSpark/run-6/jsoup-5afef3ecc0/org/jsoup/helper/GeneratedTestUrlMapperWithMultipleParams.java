package org.jsoup.helper;

public class GeneratedTestUrlMapperWithMultipleParams {

    public String buildString(String baseUrl) {
        // implementation of buildString method goes here
        return "";
    }

    @Test
    public void testUrlMapperWithMultipleParams() throws Exception {
        String baseUrl = "http://example.com/path/to/resource1?param1=value1&param2=value2&param3=value3";
        String[] expectedResult = {"https://example.com/path/to/resource1", "http://example.com/path/to/resource1?param1=value1&param2=value2&param3=value3"};
        Assert.assertEquals(Arrays.asList(expectedResult), buildString(baseUrl));
    }

}