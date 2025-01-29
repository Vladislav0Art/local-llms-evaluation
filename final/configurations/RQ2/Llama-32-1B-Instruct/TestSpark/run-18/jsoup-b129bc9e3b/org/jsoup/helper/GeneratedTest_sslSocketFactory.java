package org.jsoup.helper;

public class GeneratedTest_sslSocketFactory {

    @Test
    public void test_sslSocketFactory() throws Exception {
        HttpConnection conn = new HttpConnection();
        SSLSocketFactory sslSocketFactory = null;
        conn.sslSocketFactory(sslSocketFactory);
        Assert.assertTrue(conn.sslSocketFactory() != null);
    }

}