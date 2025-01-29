package org.jsoup.helper;

public class GeneratedTest_timeout {

    @Test
    public void test_timeout() throws Exception {
        HttpConnection conn = new HttpConnection(1000); // 1 second timeout
        Assert.assertTrue(conn.timeout(1000) != null);
    }

}