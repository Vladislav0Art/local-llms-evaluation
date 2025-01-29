package org.jsoup.helper;

public class GeneratedTest_ignoreContentType {

    @Test
    public void test_ignoreContentType() throws Exception {
        HttpConnection conn = new HttpConnection();
        String contentType = null;
        conn.ignoreContentType(contentType);
        Assert.assertTrue(conn.ignoreContentType());
    }

}