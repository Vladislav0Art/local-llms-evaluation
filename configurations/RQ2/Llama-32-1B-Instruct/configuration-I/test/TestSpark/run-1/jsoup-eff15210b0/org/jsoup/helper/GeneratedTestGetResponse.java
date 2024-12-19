package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetResponse {

    @Test
    public void testGetResponse() throws IOException {
        HttpConnection connection = new HttpConnection();
        Request request = new Request();
        Connection response = connection.request(request);
        Document document = response.get();
        System.out.println(document.toString());
    }

}