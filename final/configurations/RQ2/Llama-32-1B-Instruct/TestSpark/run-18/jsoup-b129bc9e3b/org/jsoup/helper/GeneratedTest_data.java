package org.jsoup.helper;

public class GeneratedTest_data {

    @Test
    public void test_data() throws Exception {
        HttpConnection conn = new HttpConnection();
        Map<String, String> data = Collections.singletonMap("key", "value");
        conn.data("key", "value");
        Assert.assertNotNull(conn.data());
    }

}