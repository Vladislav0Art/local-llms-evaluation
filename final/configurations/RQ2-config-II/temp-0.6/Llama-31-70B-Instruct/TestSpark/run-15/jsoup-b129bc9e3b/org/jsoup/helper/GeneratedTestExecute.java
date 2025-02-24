package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestExecute {

    @Test
    public void testExecute() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        Response response = httpConnection.execute();
        assertEquals(200, response.statusCode());
    }

}