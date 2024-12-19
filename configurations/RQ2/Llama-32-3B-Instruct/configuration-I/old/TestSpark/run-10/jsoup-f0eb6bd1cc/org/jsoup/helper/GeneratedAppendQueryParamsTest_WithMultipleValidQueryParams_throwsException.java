package org.jsoup.helper;

public class GeneratedAppendQueryParamsTest_WithMultipleValidQueryParams_throwsException {

    @Test
    public void appendQueryParamsTest_WithMultipleValidQueryParams_throwsException() {
        String queryParams1 = "key1=value1";
        String queryParams2 = "key2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(Connection.KeyVal.ConnectionKeyVAL(parameters, queryParams1));
            urlBuilder.appendKeyVal(Connection.KeyVal.ConnectionKeyVAL(parameters, queryParams2));
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}