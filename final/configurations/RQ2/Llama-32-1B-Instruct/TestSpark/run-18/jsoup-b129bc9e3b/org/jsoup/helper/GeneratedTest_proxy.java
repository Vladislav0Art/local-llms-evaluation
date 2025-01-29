package org.jsoup.helper;

public class GeneratedTest_proxy {

    @Test
    public void test_proxy() throws Exception {
        HttpConnection conn = new HttpConnection();
        String host = "example.com";
        int port = 8080;
        conn.setProxy(Proxies.get(host), port);
        Assert.assertTrue(conn.proxy(host, port) != null);
    }

}