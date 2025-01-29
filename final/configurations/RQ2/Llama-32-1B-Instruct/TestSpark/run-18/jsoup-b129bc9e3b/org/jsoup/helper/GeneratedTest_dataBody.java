package org.jsoup.helper;

public class GeneratedTest_dataBody {

    @Test
    public void test_dataBody() throws Exception {
        HttpConnection conn = new HttpConnection();
        String body = "Hello World!";
        conn.dataBody(body);
        Assert.assertNotNull(conn.data());
    }

}