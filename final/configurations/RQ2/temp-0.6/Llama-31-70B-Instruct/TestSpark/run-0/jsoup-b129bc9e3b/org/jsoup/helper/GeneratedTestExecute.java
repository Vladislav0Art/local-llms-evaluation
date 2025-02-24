package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

public class GeneratedTestExecute {

    private static final String TEST_URL = "http://www.example.com";

    @Test
    public void testExecute() throws IOException {
        HttpConnection connection = HttpConnection.connect(TEST_URL);
        Request request = connection.request();
        Response response = connection.execute();
        assertEquals(200, response.statusCode());
    }

}