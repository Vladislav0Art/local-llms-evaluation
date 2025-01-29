package org.jsoup.helper;

public class GeneratedTest_maxBodySize {

    @Test
    public void test_maxBodySize() throws Exception {
        HttpConnection conn = new HttpConnection(1024 * 1024 * 10); // 10MB max body size
        Assert.assertTrue(conn.maxBodySize(1024 * 1024 * 20) != null);
    }

}