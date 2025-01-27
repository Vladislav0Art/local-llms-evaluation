package org.jsoup.helper;

import org.junit.Test;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        String body = "Hello World!";
        HttpConnection connect = new HttpConnection();
        Connection url = connect.connect("http://localhost:8080", 8080, body);
        assertUrl(url, HttpMethod.POST, body);
    }

}