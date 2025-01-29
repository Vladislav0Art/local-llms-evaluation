package org.jsoup.helper;

public class GeneratedTest_connectUrlWithQueryParams {

    @Test
    public void test_connectUrlWithQueryParams() throws Exception {
        URL url = new URL("http://example.com?param1=value1&param2=value2");
        HttpConnection conn = new HttpConnection(url);
        Assert.assertNotNull(conn);
    }

}