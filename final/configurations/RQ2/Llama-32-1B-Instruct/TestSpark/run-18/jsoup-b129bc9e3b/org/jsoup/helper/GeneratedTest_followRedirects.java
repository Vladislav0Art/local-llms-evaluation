package org.jsoup.helper;

public class GeneratedTest_followRedirects {

    @Test
    public void test_followRedirects() throws Exception {
        HttpConnection conn = new HttpConnection();
        conn.followRedirects(true);
        Assert.assertTrue(conn.followRedirects());
    }

}