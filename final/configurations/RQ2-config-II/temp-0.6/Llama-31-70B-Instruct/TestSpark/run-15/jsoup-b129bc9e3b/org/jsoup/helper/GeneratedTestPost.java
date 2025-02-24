package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPost {

    @Test
    public void testPost() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        Response response = httpConnection.post();
        assertEquals(200, response.statusCode());
    }

}