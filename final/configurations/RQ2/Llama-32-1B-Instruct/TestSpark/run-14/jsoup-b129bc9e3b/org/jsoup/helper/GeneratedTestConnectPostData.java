package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectPostData {

    @Test
    public void testConnectPostData() {
        String body = "This is a sample response.";
        Map<String, String> headers = new HashMap<>();
        headers.put("header", "value");
        HttpConnection connection = new HttpConnection(headers);
        assertEquals(body, connection.requestbody("POST", "", body));
    }

}