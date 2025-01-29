package org.jsoup.helper;

public class GeneratedTest_userAgent {

    @Test
    public void test_userAgent() throws Exception {
        HttpConnection conn = new HttpConnection();
        String userAgent = "My User Agent";
        conn.userAgent(userAgent);
        Assert.assertNotNull(conn.userAgent());
    }

}