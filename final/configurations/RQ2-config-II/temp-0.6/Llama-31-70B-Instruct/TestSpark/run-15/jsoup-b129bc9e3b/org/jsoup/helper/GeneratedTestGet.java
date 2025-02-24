package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGet {

    @Test
    public void testGet() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        Response response = httpConnection.get();
        assertEquals(200, response.statusCode());
    }

}