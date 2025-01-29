package org.jsoup.helper;

public class GeneratedTest_connectUrl {

    @Test
    public void test_connectUrl() throws Exception {
        URL url = new URL("http://example.com");
        HttpConnection conn = new HttpConnection(url);
        Assert.assertNotNull(conn);
    }

}