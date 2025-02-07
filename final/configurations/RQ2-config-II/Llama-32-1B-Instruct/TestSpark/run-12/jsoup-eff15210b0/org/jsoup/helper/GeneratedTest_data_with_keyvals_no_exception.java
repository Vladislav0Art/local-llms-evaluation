package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_data_with_keyvals_no_exception {

    @Test
    public void test_data_with_keyvals_no_exception() throws Exception {
        String url = "http://example.com";
        Connection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key1", "value1");
        connection.request().data(data);
        assertEquals(0, connection.request().data());
    }

}