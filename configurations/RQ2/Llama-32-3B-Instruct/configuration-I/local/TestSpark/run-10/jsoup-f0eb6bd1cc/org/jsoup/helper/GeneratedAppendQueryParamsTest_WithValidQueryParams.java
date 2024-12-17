package org.jsoup.helper;

public class GeneratedAppendQueryParamsTest_WithValidQueryParams {

    @Test
    public void appendQueryParamsTest_WithValidQueryParams() throws UnsupportedEncodingException {
        String queryParams = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        urlBuilder.appendKeyVal(Connection.KeyVal.ConnectionKeyVAL(parameters, queryParams));
        assertEquals(2, urlBuilder.build().getQuery().length());
    }

}