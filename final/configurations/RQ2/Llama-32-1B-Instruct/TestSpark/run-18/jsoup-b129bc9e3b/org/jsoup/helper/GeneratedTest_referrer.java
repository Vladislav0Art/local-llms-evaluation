package org.jsoup.helper;

public class GeneratedTest_referrer {

    @Test
    public void test_referrer() throws Exception {
        HttpConnection conn = new HttpConnection();
        String referrer = null;
        conn.referrer(referrer);
        Assert.assertNotNull(conn.referrer());
    }

}