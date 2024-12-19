package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

public class GeneratedTestPostRequest {

    @Test
    public void testPostRequest() throws IOException {
        HttpConnection connection = new HttpConnection();
        Request request = new Request();
        Connection response = connection.post(request);
        Document document = response.get();
        System.out.println(document.toString());
    }

}