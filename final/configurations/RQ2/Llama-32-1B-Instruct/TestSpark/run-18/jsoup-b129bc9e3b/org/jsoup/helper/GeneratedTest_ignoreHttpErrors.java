package org.jsoup.helper;

public class GeneratedTest_ignoreHttpErrors {

    @Test
    public void test_ignoreHttpErrors() throws Exception {
        HttpConnection conn = new HttpConnection();
        conn.ignoreHttpErrors(false);
        Assert.assertFalse(conn.ignoreHttpErrors());
    }

}